package Lab02_02;

public class InputComponent {
	
	private IValidation validation;
	private String data;
	
	public InputComponent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InputComponent( String data,IValidation validation) {
		super();
		this.validation = validation;
		this.data = data;
	}

	public IValidation getValidation() {
		return validation;
	}

	public void setValidation(IValidation validation) {
		this.validation = validation;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String display() {
		return "InputComponent [validation=" + validation + ", data=" + data + "]";
	}
	
	public boolean validate() {
		return validation.validate(this.data);
		
	}

}
