package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNoPhone implements State {

	@Override
	public Contact handRequest(ArrayList<Contact> allContacts) {
		Scanner sc = new Scanner(System.in);
		Ivalidation valid = new ValidNoPhone();
		
		System.out.print("Enter phone number to find: ");
		String noPhone = sc.nextLine(); 	//get phone number
		
		for (Contact currentContact : allContacts) {
			if (currentContact.getNoPhone() == noPhone)
				return currentContact;
		}
		return null;
	}

}
