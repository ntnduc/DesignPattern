package Application;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact implements State{
	private int position;
	public DeleteContact(int position) {
		this.position = position;
	}
	@Override
	public Contact handRequest() {
		// TODO Auto-generated method stub
		
		allContacts.remove(position);
		System.out.print("\nDelete done!\n");
		
		return null;
	}
	
}
