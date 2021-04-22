package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewContact implements State {
	private String name;
	private String noPhone;
	private String email;
	
	DatabaseContact AppContact2Data = new DatabaseContact();
	public AddNewContact() {};
	public AddNewContact(String name, String noPhone, String email) {
		this.name = name;
		this.noPhone = noPhone;
		this.email = email;
	}

	@Override
	public Contact handRequest() {
		// TODO Auto-generated method stub
		Ivalidation valid = new ValidContact();
		
		
		Contact newContact = new Contact(name, noPhone, email);	//create new contact
		
		valid = new ValidContact();
		if(valid.valid(newContact)) {
			AppContact2Data.addContactToData(newContact);
			System.out.print("\nSuccessfull!\n");
			return newContact;
		}
		return null;
	}

}
