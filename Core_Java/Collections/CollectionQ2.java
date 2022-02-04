import java.util.*;

public class CollectionQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<ArrayList> product = new HashSet<ArrayList>();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("America");
		al1.add("Britain");
		al1.add("Canada");
		al1.add("Denmark");
		al1.add("England");
		System.out.println(al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Finland");
		al2.add("Greenwich");
		al2.add("Hungary");
		al2.add("India");
		al2.add("Jordan");
		System.out.println(al2);
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Korea");
		al3.add("Latvia");
		al3.add("Mongolia");
		al3.add("Nepal");
		al3.add("Oman");
		System.out.println(al3);
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Poland");
		al4.add("Qatar");
		al4.add("Russia");
		al4.add("Sri Lanka");
		al4.add("Taiwan");
		System.out.println(al4);
		
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Uganda");
		al5.add("Vietnam");
		al5.add("Wales");
		al5.add("Yemen");
		al5.add("Zimbabwe");
		System.out.println(al5);
		
		ArrayList<String> al6 = new ArrayList<String>();
		al6.add("Amritsar");
		al6.add("Bangalore");
		al6.add("Chennai");
		al6.add("Dehradun");
		al6.add("Ellora");
		System.out.println(al6);
		
		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("Fatehgarh");
		al7.add("Goa");
		al7.add("Hyderabad");
		al7.add("Indore");
		al7.add("Jalandhar"); 
		System.out.println(al7);
		
		ArrayList<String> al8 = new ArrayList<String>();
		al8.add("Kanpur");
		al8.add("Ludhiana");
		al8.add("Mumbai");
		al8.add("Nainital");
		al8.add("Ooty");
		System.out.println(al8);
		
		ArrayList<String> al9 = new ArrayList<String>();
		al9.add("Patiala");
		al9.add("Quthbullapur");
		al9.add("Rajasthan");
		al9.add("Shimla");
		al9.add("Tada");
		System.out.println(al9);
		
		ArrayList<String> al10 = new ArrayList<String>();
		al10.add("Udupi");
		al10.add("Varanasi");
		al10.add("Wagada");
		al10.add("Yamuna Nagar");
		al10.add("Zirakpur");
		System.out.println(al10);
		
		ArrayList<String> al11 = new ArrayList<String>();
		al11.add("Udupi");
		al11.add("Varanasi");
		al11.add("Wagada");
		al11.add("Yamuna Nagar");
		al11.add("Zirakpur");
		System.out.println(al11);
		
		ArrayList<String> al12 = new ArrayList<String>();
		al12.add("Udupi");
		al12.add("Varanasi");
		al12.add("Wagada");
		al12.add("Yamuna Nagar");
		al12.add("Zirakpur");
		System.out.println(al12);
		
		product.add(al1);
		product.add(al2);
		product.add(al3);
		product.add(al4);
		product.add(al5);
		product.add(al6);
		product.add(al7);
		product.add(al8);
		product.add(al9);
		product.add(al10);
		product.add(al11);
		product.add(al12);
		System.out.println(product.size());// added 12 but it's 10 
		//because of duplicates in al11, al12
		
	}

}
