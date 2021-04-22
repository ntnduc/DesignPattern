package Application;

import java.util.ArrayList;

//user State pattern
public interface State {
	ArrayList<Contact> allContacts = new ArrayList();
	Contact handRequest();
}
