package Application;

import java.util.ArrayList;

public class ContactIterator implements Iterator {
	ArrayList<Contact> contacts;
	private int position = 0;
	
	
	public ContactIterator (ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}
	@Override
	public boolean hasNext() {
		if (this.position >= this.contacts.size()) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean preItem() {
		while(position !=0) {
			if (position >0) {
				position--;
			}else {
				position++;
			}
		}
		return true;
	}

	@Override
	public Contact next() {
		// TODO Auto-generated method stub
		Contact ContactItem = this.contacts.get(this.position++);
		return ContactItem;
	}
}
