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

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Screen extends JFrame {
	public JFrame mainFrame;
	
	public JButton addContact;
	public JButton deleteContact;
	public JButton reloadContact;
	public JButton okButton;
	public JButton cancelButton;
	
	public JTextField search;
	public JTextField nameField;
	public JTextField noPhoneField;
	public JTextField emailField;
	
	public JLabel messageLabel;
	public JLabel nameLabel;
	public JLabel noPhoneLabel;
	public JLabel emailLabel;
	
	
	public void controlScreen() {
		DatabaseContact contactUser = new DatabaseContact();
		
		JPanel panelControl = new JPanel(new FlowLayout());
		JPanel panelSearch = new JPanel(new FlowLayout());
		
			
		mainFrame = new JFrame("Contact");
			//Screen Control
			panelControl.setPreferredSize(new Dimension(500,30));
			panelControl.setBackground(Color.blue);
			addContact = new JButton("Add Contact");
			deleteContact = new JButton("Delete Contact");
			reloadContact = new JButton("Reload Contact");
			
			addContact.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					_showScreenAddNewContact();
				}
			});
			//set layout panel control
			panelControl.add(addContact);
			panelControl.add(deleteContact);
			panelControl.add(reloadContact);
			
		mainFrame.add(panelControl);
			//Screen panel search
			panelSearch.setPreferredSize(new Dimension(500,70));
			panelSearch.setBackground(Color.yellow);
			
			messageLabel = new JLabel("Search Contact:");
			messageLabel.setFont(new Font(messageLabel.getFont().getName(), Font.BOLD, 20));
			messageLabel.setForeground(Color.blue);
			search = new JTextField("Enter contact to search",18);
			//set layout panel search
			panelSearch.setLayout(new BorderLayout());
			panelSearch.add(messageLabel, BorderLayout.CENTER);
			panelSearch.add(search, BorderLayout.SOUTH);
			
		mainFrame.add(panelSearch);
		
		//set layout Frame
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setLayout(new FlowLayout());
		mainFrame.repaint();
	}
	
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
					dispose();
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
}
