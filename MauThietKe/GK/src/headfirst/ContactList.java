package headfirst;

import java.util.Arrays;

public class ContactList {
	
	private Contact[] ContactList = new Contact[100];
	private int count;
	
	public ContactList() {
		super();
	}
	
	public void addContact(String username, String email, String id, String phone) {
		if (this.ContactList == null) {
			this.count = 0;
			Contact _contact = new Contact(username, email, id, phone);
			this.ContactList[this.count] = _contact;
		}else {
			Contact _contact = new Contact(username, email, id, phone);
			this.count++;
			this.ContactList[this.count] = _contact;
		}
	}
	
	public Contact deleteContact(String id) {
		for (int _idContact =0; _idContact <this.count; _idContact++) {
			if (ContactList[_idContact].getId() == id) {
				Contact result = ContactList[_idContact];
				for (int j = _idContact; j<=this.count;j++) {
					this.ContactList[j] = this.ContactList[_idContact+1];
					this.count--;
				}
				return result;
			}
		}
		
		return null;
	}
	
	public Contact hasContact(String id) {
		for (Contact _contact : this.ContactList) {
			if(_contact.getId() == id) {
				return _contact;
			}
		}
		return null;
	}
	
	public Contact[] getAllContact() {
		return this.ContactList;
	}

	@Override
	public String toString() {
		return "ContactList [ContactList=" + Arrays.toString(ContactList) + "]";
	}
	

}
