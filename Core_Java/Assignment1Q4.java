import java.util.*;
class ResultDeclaration{
	public String declareResults(double subject1marks, double subject2marks, double subject3marks) {
		String result = " ";
		if(subject1marks >= 60 && subject2marks >=60 && subject3marks >=60){
				result = "Passed";
				System.out.print(result);
			} else if ((subject1marks>60 && subject2marks>60) ||  
					(subject2marks>60 && subject3marks>60) ||
			        (subject3marks>60 && subject1marks>60)) {
				result = "Promoted";
				System.out.print(result);
			} else if((subject1marks<60 && subject2marks <60 && subject3marks <60)
					||(subject1marks>=60 && subject2marks <60 && subject3marks <60)
					||(subject1marks<60 && subject2marks >=60 && subject3marks <60)
					||(subject1marks<60 && subject2marks <60 && subject3marks >=60)) {
				result = "Failed";
				System.out.print(result);
			}
		return result;
	}
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double s1m, s2m, s3m;
		
		System.out.println("Enter the marks of subject 1: ");
		s1m = sc.nextDouble();
		System.out.println("Enter the marks of subject 2: ");
		s2m = sc.nextDouble();
		System.out.println("Enter the marks of subject 3: ");
		s3m = sc.nextDouble();
		
		ResultDeclaration rd = new ResultDeclaration();
		rd.declareResults(s1m, s2m, s3m);
	}

}
