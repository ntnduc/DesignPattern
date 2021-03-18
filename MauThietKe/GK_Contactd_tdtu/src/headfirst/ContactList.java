package headfirst;


public class ContactList {
	
	private Contact[] ContactList = new Contact[100];
	private int count;
	
	//Constructor 
	private ContactList() {
		super();
	}
	private static ContactList contactList;
	
	public static ContactList getInstance() {
		if (contactList == null) {
			contactList = new ContactList(); 
		}
		return contactList;
	}
	
	//add Contact to Contact list
	public void addContact(Contact _contact) {
		if (this.ContactList == null) {
			this.count = 0;
			
			this.ContactList[this.count] = _contact;
		}else {
			
			this.count++;
			this.ContactList[this.count] = _contact;
		}
	}
	
	//input contact to user
	public boolean inputContact(int type) {
		Contact _contact = null;
		if (type == 1) {
			_contact = new HoHang();
		} else if (type == 2) {
			_contact = new BanBe();
		}else {
			_contact = new KhachHang();
		}
		
		if (this.hasContact(_contact) == true) {
			return false;
		}else {
			this.addContact(_contact);
			return true;
		}
	}
	
	//delete contact in contact list
	public Contact deleteContact(String id) {
		for (int _countContact = 0; _countContact <=this.count; _countContact++) {
			if ((this.ContactList[_countContact]!=null) && (this.ContactList[_countContact].getId().equals(id))) {
				this.count--;
				Contact result = this.ContactList[_countContact];
				for (int j = _countContact; j<=this.count; j++) {
					this.ContactList[j] = this.ContactList[j+1];
				}
				return result; 
			}
		}
		return null;
	}
	
	//check contact in contact list
	public boolean hasContact(Contact _contact) {
		if(this.ContactList == null) {
			return false;
		} else{
			for ( Contact checkContact : ContactList) {
				if ((checkContact != null) && (checkContact.equals(_contact))) {
					return true;
				}
			}
		}
		return false;
	}
	
	//get all contact in contact list
	public Contact[] getAllContact() {
		if(this.ContactList == null) {
			return null;
		}else {
			return this.ContactList;
		}
	}

	//Show contact
	public void display() {
		if (this.ContactList == null) {
			System.out.print("null..!!!");
		}else {
			for (int _contact = 1; _contact <= this.count; _contact++) {
				System.out.print(this.ContactList[_contact].toString() + "\n");
			}
		}
	}

}
