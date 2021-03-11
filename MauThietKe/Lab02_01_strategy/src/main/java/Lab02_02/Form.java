package Lab02_02;

import java.util.ArrayList;
import java.util.List;

public class Form {
	public List<InputComponent> components = new ArrayList<InputComponent>();
	
	public void addComponent (InputComponent component) {
		this.components.add(component);
		
	}
	
	public boolean validateForm() {
		for (InputComponent _component: components) {
			if(_component.validate() == false) {
				return false;
			}
		}
		return true;
	}
		
}
