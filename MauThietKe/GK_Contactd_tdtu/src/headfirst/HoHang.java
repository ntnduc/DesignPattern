package headfirst;

import java.util.Scanner;

public class HoHang extends Contact {
	
	private String moiQuanHe;
	
	public HoHang() {
		super();
		this.inputData();
	}
	
	public HoHang(String moiQuanHe) {
		this.moiQuanHe = moiQuanHe;
	}
	
	public void inputData() {
		System.out.print("Nhap lien he ho hang.");
		setId();
		setMoiQuanHe();
		setUserName();
		setEmail();
		setPhone();
	}
	
	public void setMoiQuanHe() {
		System.out.print("Nhap vao moi quan he: ");
		this.moiQuanHe = sc.next();
	}

	@Override
	public String toString() {
		return "HoHang [moiQuanHe=" + moiQuanHe + ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail()
				+ ", getId()=" + getId() + ", getPhone()=" + getPhone() + "]";
	}
	
	
}
