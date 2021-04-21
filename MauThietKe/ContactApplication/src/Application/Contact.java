package Application;

public class Contact {
	private String name;
	private String noPhone;
	private String emailAddress;
	/**
	 * @param name
	 * @param noPhone
	 * @param emailAddress
	 */
	public Contact(String name, String noPhone, String emailAddress) {
		setName(name);
		setNoPhone(noPhone);
		setEmailAddress(emailAddress);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNoPhone() {
		return noPhone;
	}
	
	public void setNoPhone(String noPhone) {
		this.noPhone = noPhone;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Contact [name=" + this.name + ", noPhone=" + this.noPhone + ", emailAddress=" + this.emailAddress + "]";
	}
	
	
	
	
	
	
	
}
