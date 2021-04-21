package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseContact {
	static ArrayList<Contact> allContacts = new ArrayList<Contact>();
	static Scanner sc = new Scanner(System.in);
	//user State pattern
	private State state;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void applyState() {
		this.state.handRequest(allContacts);
	}
	
	public void addContactToData(Contact newContact) {
		allContacts.add(newContact);
	}
	
	public ArrayList<Contact> getAllContacts(){
		return allContacts;
	}
	
	public static Iterator createIterator() {
		return new ContactIterator(allContacts);
	}
	
//	public static void AddContact() {
//		
//		System.out.print("Enter name contact: ");
//		String name = sc.nextLine();		//Input name
//		System.out.print("\nEnter phone number: ");
//		String noPhone = sc.nextLine();		//Input phone
//		System.out.print("\nEnter email address: ");
//		String emailAddress = sc.nextLine();	//Input email
//		
//		Contact newContact = new Contact(name, noPhone, emailAddress);	//create new contact
//		
//		valid = new ValidContact();
//		if(valid.valid(newContact)) {
//			allContacts.add(newContact);
//		}
//		
//	}
	
//	public static void DeleteContact(int position) {
//		allContacts.remove(position);
//	}
	
	
}
