package qlsv;

public class Course {
	private String nameCourse;
	private int numberOfCredits;
	private float score;
	
	public Course(String nameCourse, int numberOfCredits, float score) {
		super();
		this.nameCourse = nameCourse;
		this.numberOfCredits = numberOfCredits;
		this.score = score;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	
	
}
