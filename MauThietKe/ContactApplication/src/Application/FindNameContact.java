package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNameContact implements State{

	@Override
	public Contact handRequest(ArrayList<Contact> allContacts) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name want to find: ");
		String name = sc.nextLine();
		for (Contact currentContact : allContacts) {
			if (currentContact.getName() == name) {
				return currentContact;
			}
		}
		return null;
	}
	
}
