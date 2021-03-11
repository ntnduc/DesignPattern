package Lab02_02;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidation implements IValidation {

	public boolean validate(String data) {
		SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    
	    try
	    {
	        java.util.Date javaDate = sdfrmt.parse(data); 
	        return true;
	    }
	  
	    catch (ParseException e)
	    {
	        return false;
	    }
	}

}
