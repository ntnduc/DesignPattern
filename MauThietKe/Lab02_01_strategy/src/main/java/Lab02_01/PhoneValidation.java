package Lab02_01;

import Lab02_02.IValidation;

public class PhoneValidation implements IValidation {
	
	public boolean validate(String data) {
		// TODO Auto-generated method stub
		String regexStr = "^[0-9]*$";
		return data.matches(regexStr);
	}

}
