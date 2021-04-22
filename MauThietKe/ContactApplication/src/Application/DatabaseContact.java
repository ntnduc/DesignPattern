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
		this.state.handRequest();
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
	
}
