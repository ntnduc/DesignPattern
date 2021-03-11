package Lab02_02;

public class StringMaxLengthValidation implements IValidation {
	private int length = 100;
	public boolean validate(String data) {
		if(data.length() > this.length) {
			return false;
		}else {
			return true;
		}
		
	}

}
