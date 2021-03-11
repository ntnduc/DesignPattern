package Lab02_02;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Form forms = new Form();
		forms.addComponent(new InputComponent("11.2", new DecimalValidation()));
		forms.addComponent(new InputComponent("Nguyen Tran Nhat Duc", new StringMaxLengthValidation()));
		forms.addComponent(new InputComponent("11/02/2018", new DateValidation()));

		System.out.print(forms.validateForm());
		
		forms.addComponent(new InputComponent("11.2a", new DecimalValidation()));
		
	}

}
