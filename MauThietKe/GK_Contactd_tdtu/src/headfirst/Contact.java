package headfirst;

import java.util.Scanner;

public abstract class Contact {
	private String userName;
	private String email;
	private String id;
	private String phone;
	
	Scanner sc = new Scanner(System.in);
	
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
	}
	
	protected void setPhone() {
		System.out.print("Nhap so dien thoai: ");
		this.phone = sc.nextLine();
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
