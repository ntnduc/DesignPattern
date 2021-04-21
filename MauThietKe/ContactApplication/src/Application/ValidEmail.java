package Application;

public class ValidEmail implements Ivalidation {

	@Override
	public boolean valid(Contact data) {
		// TODO Auto-generated method stub
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	    return data.getEmailAddress().matches(regex);
	}

}
