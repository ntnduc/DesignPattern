package headfirst;

public class PhoneValidation implements Ivalidation {
	
	public boolean validate(String data) {
		// TODO Auto-generated method stub
		String regexStr = "^[0-9]*$";
		return data.matches(regexStr);
	}

}
