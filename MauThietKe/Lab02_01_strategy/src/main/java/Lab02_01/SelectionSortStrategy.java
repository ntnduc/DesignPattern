package Lab02_01;

public class SelectionSortStrategy implements ISortStrategy {


	public void sort(Student[] listStudent, int count) {
		// TODO Auto-generated method stub
		
		for (int i =1 ; i<=count-1;i++) {
			int min_idx = i;
			for (int j = i+1;j <= count; j++) {
				if (listStudent[j].getCode() < listStudent[min_idx].getCode()) {
					min_idx = j;
				}
				Student temp = listStudent[min_idx];
				listStudent[min_idx] = listStudent[i];
				listStudent[i] = temp;
			}
		}
		
	}

}
