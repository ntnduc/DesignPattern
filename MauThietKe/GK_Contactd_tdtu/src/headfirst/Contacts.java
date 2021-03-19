package headfirst;

public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Runn\n");
		ContactList _contactList = ContactList.getInstance();
		
		System.out.print(_contactList.inputContact(1) + "\n");
		System.out.print(_contactList.inputContact(1) + "\n");
		System.out.print(_contactList.inputContact(2) + "\n");
		System.out.print(_contactList.inputContact(3) + "\n");
		
		_contactList.display();
		
		_contactList.deleteContact("2");
		
		_contactList.display();
	}

}
