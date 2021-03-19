package headfirst;

import java.util.Scanner;

public abstract class Contact {
	private String userName;
	private String email;
	private String id;
	private String phone;
	
	Scanner sc = new Scanner(System.in);
	
	EmailValidation emailValid = new EmailValidation();
	PhoneValidation phoneValid = new PhoneValidation();
	
	protected void setId() {
		System.out.print("Nhap id: ");
		this.id = sc.nextLine();
	}
	
	protected void setUserName() {
		System.out.print("Nhap Ten: ");
		this.userName = sc.nextLine();
	}
	
	protected void setEmail() {
		System.out.print("Nhap email: ");
		this.email = sc.nextLine();
		while (this.emailValid.validate(this.email)==false) {
			System.out.print("Nhap sai dinh dang email. Nhap lai email: ");
			this.email = sc.nextLine();
		}
	}
	
	protected void setPhone() {
		System.out.print("Nhap so dien thoai: ");
		this.phone = sc.nextLine();
		while(this.phoneValid.validate(this.phone)==false) {
			System.out.print("Nhap sai dinh dang so dien thoai. Nhap lai sdt: ");
			this.phone = sc.nextLine();
		}
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public abstract String toString();
	
}
