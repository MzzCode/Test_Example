package myprivate;

class PrivateExampleA {

	public void display() {
		System.out.println("this is private method ");
	}

}
  class PrivateExampleB{
	public static void main(String args[]) {
		PrivateExampleA p1 = new PrivateExampleA();
		p1.display();
	}
}
  