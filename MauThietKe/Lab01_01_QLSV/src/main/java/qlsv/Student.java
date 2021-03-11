package qlsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Student {
	private int idStudent;
	private String nameStudent;
	private int countCourse;
	private List<Course> listCourse= new ArrayList<Course>(); 
	

	public Student(int idStudent, String nameStudent, int countCourse) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.countCourse = countCourse;
	}
	
	public Student() {}
	
	public int getIdStudent() {
		return idStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}
	
	public int getCountCourse() {
		return countCourse;
	}
	
	public String getLevel() {
		return "Level of student: " + level();
	}
	
	public String getGPA() {
		return "GPA of student "+ getNameStudent() +": "+ GPA();
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	
	public void setCountCourse(int countCourse) {
		this.countCourse = countCourse;
	}
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void addCourse() {
		System.out.print("Enter to start");
		
		for (int i=0; i < countCourse; i++) {
			
			String nameCourse = scanner.nextLine();
			
			System.out.print("Input course name: ");
			nameCourse = scanner.nextLine();
			
			System.out.print("Input number of creadits: ");
			int numberOfCredits =  scanner.nextInt();
			
			System.out.print("Input score: ");
			float score = scanner.nextFloat();
			
			Course _course = 
					new Course(nameCourse, numberOfCredits, score);
			listCourse.add(_course);
		}
		
	}
	
	public void Show() {
		System.out.print("Name student: " + getNameStudent() + "\n");
		int i=0;
		
//		System.out.format("%5d" , "STT");
//		System.out.format("%20s", "Name course");
//		System.out.format("%5f","Score");
//		System.out.format("%5d", " Number of creadits");
		for (Course _course: listCourse) {
			System.out.format("%5d", i);
			System.out.format("%20s", _course.getNameCourse());
			System.out.format("%5f", _course.getScore());
			System.out.format("%5d", _course.getNumberOfCredits());
			i++;
			System.out.print("\n");
		}
		
		System.out.print("\n"+ getGPA());
		System.out.print("\n"+ getLevel());
		
	}
	
	private String level () {
		String _level ="";
		if(GPA()>=9) {
			_level = "Excellent";
		}else if((GPA()<8) || (GPA() >=7)) {
			_level = "Good";
		}else if((GPA()<7) || (GPA() >=6)) {
			_level = "Average";
		}else if((GPA()<6) || (GPA() >=5)) {
			_level = "Below Average";
		}else {
			_level = "Weak";
		}
		return _level;
	}
	
	private float GPA () {
		float _GPA = 0;
		for (Course _getCourse : listCourse) {
			_GPA += _getCourse.getScore() * _getCourse.getNumberOfCredits();
		}
		_GPA /=totalNumberOfCreadits();
		return _GPA;
	}
	
	private int totalNumberOfCreadits() {
		int _sumTotal=0;
		for (Course _getCourse : listCourse) {
			_sumTotal += _getCourse.getNumberOfCredits();
		}
		return _sumTotal;
	}

}
