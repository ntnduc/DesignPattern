package Lab02_01;


public class Student implements Comparable<Student> {
	
	private int code;
	private String name;
	private String birthDate;
	
	public Student(int code, String name, String birthDate) {
		super();
		this.code = code;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Student() {
		
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDAte() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	

	public int compareTo(Student that) {
		// TODO Auto-generated method stub
		if (this.code > that.code) {
			return 1;
		}else if (this.code < that.code) {
			return -1;
		}else {
			return 0;
		}
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + code;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (birthDate == null) {
			if (other.birthDate != null)
				return false;
		} else if (!birthDate.equals(other.birthDate))
			return false;
		if (code != other.code)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	
	
	
	
}
