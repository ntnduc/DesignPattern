package headfirst;

public class BanBe extends Contact{
	
	public BanBe() {
		super();
		inputData();
	}
	
	public void inputData() {
		System.out.print("Nhap lien he ban be.\n");
		setId();
		setUserName();
		setEmail();
		setPhone();
	}

	@Override
	public String toString() {
		return "BanBe [getUserName()=" + getUserName() + ", getEmail()=" + getEmail() + ", getId()=" + getId()
				+ ", getPhone()=" + getPhone() + "]";
	}
	
	

}
