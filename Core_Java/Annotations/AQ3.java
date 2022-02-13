@interface Execute{
	int sequence();
}
public class AQ3 {

	@Execute(sequence = 2)
	public void method1() {
		System.out.println("Method 1");
	}
	@Execute(sequence = 1)
	public void method2() {
		System.out.println("Method 2");
	}
	@Execute(sequence = 3)
	public void method3() {
		System.out.println("Method 3");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sequences given.");

	}

}
