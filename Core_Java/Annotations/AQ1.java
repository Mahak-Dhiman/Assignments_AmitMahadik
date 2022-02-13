@interface Test{}
class ClassTest{
	@Test
	public void display() {
		System.out.print("This is inside Test class @test.");
	}
}
public class AQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTest ct = new ClassTest();
		ct.display();

	}

}
