package Application;

import java.util.ArrayList;

//user State pattern
public interface State {
	Contact handRequest(ArrayList<Contact> allContacts);
}
