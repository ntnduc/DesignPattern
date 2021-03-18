package headfirst;

public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactList _contactList = new ContactList();
		_contactList.addContact("Duc", "proVipcute@email.com", "01", "086988xxx");
		_contactList.addContact("Dong", "DongHH@email.com", "02", "087462x2x2x");
		_contactList.addContact("Kidz", "kzet@email.com", "03", "0483297rxxxx");
		
		_contactList.toString();
	}

}
