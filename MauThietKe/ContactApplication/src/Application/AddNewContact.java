package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewContact implements State {

	@Override
	public Contact handRequest(ArrayList<Contact> allContacts) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ivalidation valid = new ValidContact();
		
		System.out.print("Enter name contact: ");
		String name = sc.nextLine();		//Input name
		System.out.print("\nEnter phone number: ");
		String noPhone = sc.nextLine();		//Input phone
		System.out.print("\nEnter email address: ");
		String emailAddress = sc.nextLine();	//Input email
		
		Contact newContact = new Contact(name, noPhone, emailAddress);	//create new contact
		
		valid = new ValidContact();
		if(valid.valid(newContact)) {
			allContacts.add(newContact);
			System.out.print("\nSuccessfull!\n");
		}
		return null;
	}

}
