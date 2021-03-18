package headfirst;

public class Contact implements Comparable <Contact>{
	private String username;
	private String email;
	private String id;
	private String phone;
	
	Contact(String username, String email, String id, String phone){
		this.username = username;
		this.email = email;
		this.id = id;
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int compareTo(Contact contact) {
		return this.getId().compareTo(contact.getId());
	}

	@Override
	public String toString() {
		return "Contact [username=" + username + ", email=" + email + ", id=" + id + ", phone=" + phone + "]";
	}
	
	
}
