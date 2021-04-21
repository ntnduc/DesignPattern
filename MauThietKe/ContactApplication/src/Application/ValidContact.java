package Application;

public class ValidContact implements Ivalidation{
	@Override
	public boolean valid(Contact data) {
		String _emailValid = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String _noPhoneValid = "^[0-9]*$";
		
		if(data.getEmailAddress().matches(_emailValid) && data.getNoPhone().matches(_noPhoneValid)) {
			return true;
		}
		if(data.getEmailAddress().matches(_emailValid) == false) {
			System.out.print("Wrong email format!");
			return false;
		}
		if(data.getNoPhone().matches(_noPhoneValid) == false) {
			System.out.print("Wrong phone format!");
			return false;
		}
		return false;
	}
}
