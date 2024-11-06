package zoo;
//Import the animals package
import animals.*;

public class Cat extends Animals {

	public Cat (String name) {
		   // Call the protected constructor
		super(name);
			}
	//method
	public void displayCatInfo() {
		// Access the protected member variable and method
		System.out.println("cat name: " +name);
		displayInfo();
	}
}
