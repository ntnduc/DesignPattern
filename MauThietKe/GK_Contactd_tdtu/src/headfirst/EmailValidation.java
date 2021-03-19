package headfirst;

public class EmailValidation implements Ivalidation {

	public boolean validate(String data) {
		// TODO Auto-generated method stub
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	    return data.matches(regex);
	}
	
}
