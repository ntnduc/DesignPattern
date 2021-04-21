package Application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadData extends FileTemplate {

	@Override
	boolean writeData() {
		// TODO Auto-generated method stub
		//do nothing
		return false;
	}

	@Override
	boolean readData() {
		// TODO Auto-generated method stub
		DatabaseContact contact = new DatabaseContact();

		try {
			File f = new File(nameFile);
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			String _getData;
			while((_getData = br.readLine())!=null) {
				String[] _preData = _getData.split(",");
				int flag = 0;
				String _name = _preData[0];
				String _phone = _preData[1];
				String _email = _preData[2];
				
				Contact newContact = new Contact(_name, _phone, _email);
				contact.addContactToData(newContact);
			}
			return true;
		}catch(Exception ex) {
			System.out.print("Loi doc file: " + ex);
			return false;	
		}
	}

}
