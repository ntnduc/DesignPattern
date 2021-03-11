package Lab02_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
	
	private Student[] listStudent = new Student[100] ;
	private int count;
	private ISortStrategy sortStrategy;
	
	public StudentList() {
		super();
	}
	
	public void display() {
		for (int i = 0; i <= this.count; i++) {
			System.out.print(this.listStudent[i]+"\n");
		}
	}
	
	public void addStudent(Student student) {
		if (this.listStudent == null) {
			this.count = 0;
			this.listStudent[this.count] = student;
			this.count++;
		}else {
			this.listStudent[this.count+1] = student;
			this.count++;
		}
		
	}
	
	public Student removeStudent (int code) {
		for (int i =1; i <= this.count; i++) {
			if (this.listStudent[i].getCode() == code) {
				Student result = this.listStudent[i]; 
				this.count --;
				for (int j =i; j <= this.count; j++) {
					this.listStudent[j] = this.listStudent[j+1];
				}
				return result;
			}
			
		}
		return null;
	}
	
	public void sort() {
		sortStrategy.sort(this.listStudent, this.count);
	}

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}
	

}
