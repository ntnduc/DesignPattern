package Lab02_01;

import Lab02_02.IValidation;

public class EmailValidation implements IValidation {

	public boolean validate(String data) {
		// TODO Auto-generated method stub
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	    return data.matches(regex);
	}
	
}
