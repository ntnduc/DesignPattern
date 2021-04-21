package Application;

public class ValidNoPhone implements Ivalidation {

	public boolean valid(Contact data) {
		String regexStr = "^[0-9]*$";
		return data.getNoPhone().matches(regexStr);
	}

}
