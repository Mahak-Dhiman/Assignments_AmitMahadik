@FunctionalInterface interface Interest{
	public double interest(double principal, double rate, double time);
}
public class J11_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interest i = (var principal, var rate, var time)->(principal*rate*time)/100;
		double res = i.interest(192, 3, 4);
		System.out.println("Simple interest is: " +res);
	}

}
