package Application;

public class ContactApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseContact testRun = new DatabaseContact();
		Iterator contactUser = DatabaseContact.createIterator();
		FileTemplate actionFile;

//		testRun.AddContact();
//		testRun.AddContact();
//		testRun.AddContact();
		
//		testRun.setState(new AddNewContact());
//		testRun.applyState();
//		
//		testRun.setState(new AddNewContact());
//		testRun.applyState();
//		
//		testRun.setState(new AddNewContact());
//		testRun.applyState();
//		
//		
//		System.out.print("Run here");
//		contactUser.preItem();
//		while(contactUser.hasNext()) {
//			Contact _contactItem = (Contact)contactUser.next();
//			System.out.print(_contactItem.toString());
//		}
//		
//		testRun.setState(new DeleteContact());
//		testRun.applyState();
//		
//		System.out.print("\nNew List \n");
//		
//		//check pre position
//		contactUser.preItem();
//		while (contactUser.hasNext()) {
//			Contact _contactItem = (Contact)contactUser.next();
//			System.out.print(_contactItem.toString());
//		}
//		
//		actionFile = new WriteFile();
//		actionFile.writeData();
		
		actionFile = new ReadData();
		actionFile.readData();
		
		contactUser.preItem();
		while (contactUser.hasNext()) {
			Contact _contactItem = (Contact)contactUser.next();
			System.out.print(_contactItem.toString());
		}
		
		
	}

}
