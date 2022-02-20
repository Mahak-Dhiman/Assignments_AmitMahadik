import java.util.*;
public class J11Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String();
		s = "A quick brown fox jumps over the lazy dog.";
		List<String> al = new ArrayList<>();
		al = Arrays.asList(s.split(" "));
		String [] a = al.toArray(n-> new String[n]);
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
	}

}
