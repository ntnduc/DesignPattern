package headfirst;

public class KhachHang extends Contact{
	private String tenCongTy;
	
	public KhachHang() {
		super();
		inputData();
	}
	

	public void inputData() {
		System.out.print("Nhap lien he khach hang.");
		setId();
		setTenCongTy();
		setUserName();
		setEmail();
		setPhone();
	}
	
	public void setTenCongTy() {
		System.out.print("Nhap ten cong ty: ");
		this.tenCongTy = sc.next();
	}
	
	@Override
	public String toString() {
		return "KhachHang [tenCongTy=" + tenCongTy + ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail()
				+ ", getId()=" + getId() + ", getPhone()=" + getPhone() + "]";
	}
}
