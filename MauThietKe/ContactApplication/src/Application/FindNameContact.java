package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class FindNameContact implements State{
	private String name;
	private String noPhone;
	private String email;
	
	public FindNameContact(String name) {
		this.name = name;
	}
	
	@Override
	public Contact handRequest() {
		// TODO Auto-generated method stub
		
		Iterator contact = new ContactIterator(allContacts);
		contact.preItem();
		while(contact.hasNext()) {
			Contact _indexContact = contact.next();
			if(_indexContact.getName().equals(this.name)) {
				return _indexContact;
			}
		}
		return null;
	}
		
		
	
}
