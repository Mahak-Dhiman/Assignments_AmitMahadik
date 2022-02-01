abstract class Abstract{
	abstract public void testing1(); 

	public void test() {
		System.out.println("Inside test of Abstract class.");
	}
}

class Abstract2 extends Abstract{ 
	public void testing1() { //overriding abstract method in extended class.
		System.out.println("Overridden method of abstract class's.");
	}
}
public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Abstract a = new Abstract(); not possible
		Abstract2 a = new Abstract2(); //extended class object is possible
		Abstract b = new Abstract2(); //2nd way
		a.testing1();
		a.test();
		b.testing1();
		b.test();
	}

}
