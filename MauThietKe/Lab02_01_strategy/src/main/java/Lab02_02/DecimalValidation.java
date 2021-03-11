package Lab02_02;

public class DecimalValidation implements IValidation {

	public boolean validate(String data) {
		// TODO Auto-generated method stub
		try {
			Float.parseFloat(data);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
		
	}

}
