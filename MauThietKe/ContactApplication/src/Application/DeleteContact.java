package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact implements State{

	@Override
	public Contact handRequest() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter position want to delete: ");
		int position = sc.nextInt();
		allContacts.remove(position);
		System.out.print("\nDelete done!\n");
		
		return null;
	}
	
}
