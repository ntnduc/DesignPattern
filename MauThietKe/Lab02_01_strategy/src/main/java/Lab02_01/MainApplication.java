package Lab02_01;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList students = new StudentList();
		students.addStudent(new Student(001, "Nguyen Tran Nhat Duc", "23/05/2000"));
		students.addStudent(new Student(003, "Nguyen Hong Song Huong", "01/06/2001"));
		students.addStudent(new Student(002, "Nguyen Manh Hung", "28/06/2000"));
		students.addStudent(new Student(005, "Nguyen Manh Hai", "28/06/2000"));
		students.addStudent(new Student(004, "Nguyen Manh", "28/06/2000"));
		
		
		students.display();
		
			
		students.setSortStrategy(new InsertionSort());
		students.sort();
		students.display();
		
		students.removeStudent(3);
		students.display();
	}

}
