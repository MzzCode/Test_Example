package mypack;

//Class with default access

class Person {
	// Variable with default access
	 String name;
	 
	// Constructor with default access
			Person(String name){
				this.name = name;
			}
	
	// Method with default access
	 void personInfo() {
		System.out.println("my name is: " +name);
	}
	

}
