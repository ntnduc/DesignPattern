package Application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Screen extends JFrame {
	public JFrame mainFrame;
	
	public JButton addContact;
	public JButton deleteContact;
	public JButton reloadContact;
	public JButton okButton;
	public JButton cancelButton;
	public JButton saveButton;
	public JButton findContact;
	
	public JTextField search;
	public JTextField nameField;
	public JTextField noPhoneField;
	public JTextField emailField;
	
	public JLabel messageLabel;
	public JLabel nameLabel;
	public JLabel noPhoneLabel;
	public JLabel emailLabel;
	public JLabel showInforLabel;
	
	DatabaseContact contactUser = new DatabaseContact();
	JTable USERTABLE = tableContact();
	
	public void controlScreen() {
		
		//Variable all method
		
		
		
		JPanel panelControl = new JPanel(new FlowLayout());
		JPanel panelSearch = new JPanel(new FlowLayout());
		JPanel panelTable = new JPanel(new FlowLayout());
			
		mainFrame = new JFrame("Contact");
			//Screen Control
			panelControl.setPreferredSize(new Dimension(500,30));
			panelControl.setBackground(Color.blue);
			addContact = new JButton("Add Contact");
			deleteContact = new JButton("Delete Contact");
			reloadContact = new JButton("Show Contact");
			saveButton = new JButton("SAVE");
			//ACTION BUTTON
				//add contact
				addContact.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						_showScreenAddNewContact();
					}
				});
				//reload contact
				reloadContact.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						_showScreenFullContact();
					}
				});
				//Save contact
				saveButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						WriteFile write = new WriteFile();
						if(write.writeData()==true) {
							write.writeData();
							System.out.print("Lưu ngon lành");
						}else {
							System.out.print("Ngu roi");
						}
						
					}
				});
				
				//Delete contact
				deleteContact.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						_showScreenDeleteContact();
					}
				});
			//set layout panel control
			panelControl.add(addContact);
			panelControl.add(deleteContact);
			panelControl.add(reloadContact);
			panelControl.add(saveButton);
		mainFrame.add(panelControl);
			//Screen panel search
			panelSearch.setPreferredSize(new Dimension(500,70));
			panelSearch.setBackground(Color.yellow);
			
			messageLabel = new JLabel("Search Contact:");
			messageLabel.setFont(new Font(messageLabel.getFont().getName(), Font.BOLD, 20));
			messageLabel.setForeground(Color.blue);
			search = new JTextField(18);
			findContact= new JButton("Find");
			findContact.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					_showScreenMessageContact(search.getText());
				}
			});
			//set layout panel search
			panelSearch.setLayout(new BorderLayout());
			panelSearch.add(messageLabel, BorderLayout.CENTER);
			panelSearch.add(search, BorderLayout.SOUTH);
			panelSearch.add(findContact, BorderLayout.AFTER_LINE_ENDS);
			
		mainFrame.add(panelSearch);
			//Screen table contact
			
//			panelTable.add(tableContact());
//		mainFrame.add(panelTable);
		//set layout Frame
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setLayout(new FlowLayout());
		mainFrame.repaint();
	}
	
	//Screen add infor contact
	private void _showScreenAddNewContact() {
		JDialog screenContact = new JDialog (this, Dialog.ModalityType.APPLICATION_MODAL);
		screenContact.setLayout(new BorderLayout());
		
		JPanel _inforContact = new JPanel();
		JPanel _control = new JPanel();
		GridBagConstraints gbc = new GridBagConstraints();
		int _sizeText = 20;
		
		_inforContact.setLayout(new GridBagLayout());
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.anchor = GridBagConstraints.WEST;
			
			nameLabel = new JLabel("Name:");
			nameLabel.setFont(new Font(nameLabel.getFont().getName(), nameLabel.getFont().getStyle(), _sizeText ));
			_inforContact.add(nameLabel, gbc);
			gbc.gridy++;
			noPhoneLabel = new JLabel("Phone number: ");
			noPhoneLabel.setFont(new Font(noPhoneLabel.getFont().getName(), noPhoneLabel.getFont().getStyle(), _sizeText));
			_inforContact.add(noPhoneLabel, gbc);
			gbc.gridy++;
			emailLabel = new JLabel("Email: ");
			emailLabel.setFont(new Font(emailLabel.getFont().getName(), emailLabel.getFont().getStyle(), _sizeText));
			_inforContact.add(emailLabel, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 0;
//			gbc.anchor = GridBagConstraints.HORIZONTAL;
			
			nameField = new JTextField(15);
			_inforContact.add(nameField, gbc);
			gbc.gridy++;
			noPhoneField = new JTextField(15);
			_inforContact.add(noPhoneField, gbc);
			gbc.gridy++;
			emailField = new JTextField(15);
			_inforContact.add(emailField, gbc);
			// end panel infor contact
			
			//start panel control
			okButton = new JButton("OK");
			okButton.setForeground(Color.blue);
			okButton.addActionListener(new ActionListener() {		//add action to button ok
				public void actionPerformed(ActionEvent e) {
					 Ivalidation valid = new ValidContact();
					 Contact testContact = new Contact(nameField.getText(), noPhoneField.getText(), emailField.getText());
					 
					 if (valid.valid(testContact)) {
						 contactUser.setState(new AddNewContact(nameField.getText(), noPhoneField.getText(), emailField.getText()));
						 contactUser.applyState();
						 contactUser.applyState();
						 dispose();
					 }
					
				}
			});
			_control.add(okButton);
			cancelButton = new JButton("Cancel");
			cancelButton.addActionListener(new ActionListener() {		//add action to button cancel
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			_control.add(cancelButton);
			_control.setLayout(new FlowLayout());
		//add screen panel
		screenContact.add(_inforContact, BorderLayout.NORTH);
		screenContact.add(_control, BorderLayout.CENTER);
		//set layout for screen dialog
		
		screenContact.setBounds(300,300,400,150);
		screenContact.setVisible(true);
		
	}
	//end method show screen add infor
	
	//start screen message find contact
	private void _showScreenMessageContact(String nameContact) {
		JDialog _showScreen = new JDialog(this, Dialog.ModalityType.APPLICATION_MODAL);
		_showScreen.setLayout(new BorderLayout());
		ArrayList<Contact> allContacts = contactUser.getAllContacts();
//		}

		contactUser.setState(new FindNameContact(nameContact));
		contactUser.applyState();
		if(contactUser.getResultState() != null) {
			showInforLabel = new JLabel("Name: "+contactUser.getResultState().getName()+"\nPhone: "+contactUser.getResultState().getNoPhone()+"\nEmail: "+contactUser.getResultState().getEmailAddress());
		}else {
			showInforLabel = new JLabel("NULL");
		}
		_showScreen.add(showInforLabel);
		_showScreen.setBounds(300, 300, 450, 200);
		_showScreen.setVisible(true);
	}
	//end screen message find contact
	
	//start screen delete contact
	private void _showScreenDeleteContact() {
		JDialog _showScreen = new JDialog(this, Dialog.ModalityType.APPLICATION_MODAL);
		_showScreen.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		BoxLayout baxLayout = new BoxLayout(panel,BoxLayout.Y_AXIS);
		
		messageLabel = new JLabel("Nhập vào vị trí liên hệ bạn muốn xóa");
		JTextField _id = new JTextField();
		_id.setText("ID");
		okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactUser.setState(new DeleteContact( Integer.parseInt(_id.getText()) ));
				contactUser.applyState();
				dispose();
			}
		});
		panel.add(messageLabel);
		panel.add(_id);
		panel.add(okButton);
		
		_showScreen.add(panel);
		_showScreen.setBounds(300, 300, 450, 200);
		_showScreen.setVisible(true);
	}
	
	//star screen table contact in data
	private void _showScreenFullContact() {
		JDialog screenShowTable = new JDialog(this, Dialog.ModalityType.APPLICATION_MODAL);
		screenShowTable.setLayout(new BorderLayout());
		
		JPanel panelTable = new JPanel();
		JScrollPane jsp = new JScrollPane(tableContact());
		okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						}
					});
		panelTable.add(jsp, BorderLayout.CENTER);
		screenShowTable.add(panelTable, BorderLayout.CENTER);
		screenShowTable.add(okButton, BorderLayout.PAGE_END);
		screenShowTable.setBounds(300, 300, 500, 300);
		screenShowTable.setVisible(true);
	}
	protected JTable tableContact() {
		ArrayList<Contact> allContacts = contactUser.getAllContacts();
		String [] col= {"Index","Name","Phone Number","Email"};
		DefaultTableModel tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(col);
		JTable contactTable = new JTable();
		
		for(int i = 0; i < allContacts.size()-1; i++) {
			Object[] obj = {i,allContacts.get(i).getName(), allContacts.get(i).getNoPhone(), allContacts.get(i).getEmailAddress()};
//			Object[] obj = {"Dữ liệu cột 1","Dữ liệu cột 2","Dữ liệu cột 3"};
			tableModel.addRow(obj);
		}
		
		
		
		tableModel.setColumnCount(4);
		tableModel.setRowCount(allContacts.size()-1);
		
		contactTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		contactTable.setModel(tableModel);
		
		
		
		
		return contactTable; 
	}//end screen show all contact
}

