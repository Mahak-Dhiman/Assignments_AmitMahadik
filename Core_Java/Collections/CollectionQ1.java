import java.util.Comparator;
import java.util.TreeMap;
enum gender{male, female}

class Contact{
	public long phoneNo;
	public String name;
	public String email;
	gender g;
	public Contact(String name, String email, gender g) {
		this.name = name;
		this.email = email;
		this.g = g;
	}
}
class Compare implements Comparator<Contact>{
	public int compare(Contact c1, Contact c2) {
		return 0;
	}
}
	
public class CollectionQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Long, Contact> tm = new TreeMap<Long, Contact>();
		Contact c1 = new Contact("Jasmine", "jj@gmail.com", gender.female); 
		tm.put(9999999999l, c1);
		tm.put(8888888888l, new Contact("Indu", "indu@gmail.com", gender.female));
		tm.put(7777777777l, new Contact("Harman", "harman@gmail.com", gender.male));
		tm.put(6666666666l, new Contact("Geetika", "geetika@gmail.com", gender.female));
		tm.put(5555555555l, new Contact("Farhan", "farhan@gmail.com", gender.male));
		tm.put(4444444444l, new Contact("Deepak", "deepak@gmail.com", gender.male));
		tm.put(3333333333l, new Contact("Charu", "charu@gmail.com", gender.female));
		tm.put(2222222222l, new Contact("Bhavna", "bhavna@gmail.com", gender.female));
		tm.put(1111111112l, new Contact("Aman", "aman@gmail.com", gender.male));
		tm.put(1111111111l, new Contact("Kunal", "kunal@gmail.com", gender.male));
		
		System.out.println("Keys:");
		System.out.println(tm.keySet());
		System.out.println("Values:");
		System.out.println(tm.values());
		System.out.println("Pair:");
		System.out.println(tm);
	}
}

