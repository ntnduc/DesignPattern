package Lab02_01;

public class InsertionSort implements ISortStrategy {


	public void sort(Student[] student, int count) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= count; ++i) {
			Student key = student[i];
			int j = i-1;
			while (j>=1 && student[j].getCode() > key.getCode()) {
				student[j+1]= student[j];
				j = j-1;
			}
			student[j+1] = key;
			
		}
		
	}

}
