package animals;

//Base class with a protected member
public class Animals {
	// Protected member variable
protected String name;

//Protected constructor

protected Animals (String name) {
	this.name = name;
}
//Protected method
protected void displayInfo() {
	//System.out.println("Animal name: " +name);
}
}
