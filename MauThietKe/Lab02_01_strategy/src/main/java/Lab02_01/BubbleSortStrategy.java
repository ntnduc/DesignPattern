package Lab02_01;

public class BubbleSortStrategy implements ISortStrategy {

	public void sort(Student[] student, int count) {
		// TODO Auto-generated method stub
		for (int i =1; i<=count-1; i++) {
			for (int j = 1; j <=  count-i;j++) {
				if(student[j].getCode()> student[j+1].getCode()) {
					Student temp = student[j];
					student[j]=student[j+1];
					student[j+1]=temp;
				}
			}
		}
	}

}
