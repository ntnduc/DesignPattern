package Lab04_02;
import java.util.ArrayList;
public class SortedList {
	private ArrayList<Integer> list = new ArrayList<Integer>(); 
	
	public void add (int number) {
		list.add(number);
	}
	public void quickSort() {
		System.out.print("Quick Sort");
	}
	public void selectionSort() {
		System.out.print("Selection Sort");
	}
	public void bubbleSorts() {
		System.out.print("Bubble Sort");
	}
	public void printList() {
		System.out.print(list);
	}
}	
