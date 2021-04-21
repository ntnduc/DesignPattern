package Application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile extends FileTemplate{

	@Override
	boolean writeData() {
		// TODO Auto-generated method stub
		Iterator contactUser = DatabaseContact.createIterator();
		Contact _itemContact;
		
		try {
			File f = new File(nameFile);
			FileWriter fw = new FileWriter(f);
			
			contactUser.preItem();
			while(contactUser.hasNext()){
				_itemContact = contactUser.next();
				fw.write(_itemContact.getName() +","+ _itemContact.getNoPhone() +","+ _itemContact.getEmailAddress() +"\n");
			}
			fw.close();
			return true;
			
		}catch(IOException ex){
			System.out.print("Loi ghi file: "+ ex);
			return false;
		}
	}

	@Override
	boolean readData() {
		// TODO Auto-generated method stub
		//do nothing
		return false;
	}

}
