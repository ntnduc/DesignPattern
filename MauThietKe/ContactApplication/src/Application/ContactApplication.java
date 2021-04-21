package Application;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class ContactApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Screen screen = new Screen();
		JLabel _searchContact = new JLabel("Search Contact");
		
		screen.controlScreen();
		screen.mainFrame.revalidate();
		
		screen.mainFrame.revalidate();
		screen.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen.mainFrame.setSize(600,500);
		screen.mainFrame.setVisible(true);
		screen.mainFrame.revalidate();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		DatabaseContact testRun = new DatabaseContact();
//		Iterator contactUser = DatabaseContact.createIterator();
//		FileTemplate actionFile;

//		testRun.AddContact();
//		testRun.AddContact();
//		testRun.AddContact();
		
//		testRun.setState(new AddNewContact());
//		testRun.applyState();
//		
//		testRun.setState(new AddNewContact());
//		testRun.applyState();
//		
//		testRun.setState(new AddNewContact());
//		testRun.applyState();
//		
//		
//		System.out.print("Run here");
//		contactUser.preItem();
//		while(contactUser.hasNext()) {
//			Contact _contactItem = (Contact)contactUser.next();
//			System.out.print(_contactItem.toString());
//		}
//		
//		testRun.setState(new DeleteContact());
//		testRun.applyState();
//		
//		System.out.print("\nNew List \n");
//		
//		//check pre position
//		contactUser.preItem();
//		while (contactUser.hasNext()) {
//			Contact _contactItem = (Contact)contactUser.next();
//			System.out.print(_contactItem.toString());
//		}
//		
//		actionFile = new WriteFile();
//		actionFile.writeData();
		
//		actionFile = new ReadData();
//		actionFile.readData();
//		
//		contactUser.preItem();
//		while (contactUser.hasNext()) {
//			Contact _contactItem = (Contact)contactUser.next();
//			System.out.print(_contactItem.toString());
//		}
//		
//		
		
		}

}
