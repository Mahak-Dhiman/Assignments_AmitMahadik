@interface Info{
	int authId();
	String authName();
	String supervisor();
	String date();
	String time();
	double version();
	String description();
}
@Info(authId = 1, 
		authName = "Mahak", 
	  supervisor = "Amit", 
			date = "10 Feb", 
			time = "7:00PM", 
		 version = 3.30, 
	 description = "Annotations")
class ClassTest2{
	public void display() {
		System.out.print("Annotated.");
	}
}
public class AQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassTest2 ct = new ClassTest2();
		ct.display();
	}

}
