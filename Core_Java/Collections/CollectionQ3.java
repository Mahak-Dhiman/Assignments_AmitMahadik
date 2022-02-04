import java.util.*;

class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
}

class EId implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}

class EName implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class EDept implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getDept().compareTo(e2.getDept());
	}
}

class ESalary implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary()-e2.getSalary());
	}
}

public class CollectionQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> treeSetId = new TreeSet<Employee>(new EId());
		treeSetId.add(new Employee(1, "A", "CSE", 23.5));
		treeSetId.add(new Employee(2, "B", "ECE", 21.5));
		treeSetId.add(new Employee(3, "C", "AER", 24.5));
		TreeSet<Employee> treeSetName = new TreeSet<Employee>(new EName());
		treeSetName.add(new Employee(1, "A", "CSE", 23.5));
		treeSetName.add(new Employee(2, "B", "ECE", 21.5));
		treeSetName.add(new Employee(3, "C", "AER", 24.5));
		TreeSet<Employee> treeSetDept = new TreeSet<Employee>(new EDept());
		treeSetDept.add(new Employee(1, "A", "CSE", 23.5));
		treeSetDept.add(new Employee(2, "B", "ECE", 21.5));
		treeSetDept.add(new Employee(3, "C", "AER", 24.5));
		TreeSet<Employee> treeSetSalary = new TreeSet<Employee>(new ESalary());
		treeSetSalary.add(new Employee(1, "A", "CSE", 23.5));
		treeSetSalary.add(new Employee(2, "B", "ECE", 21.5));
		treeSetSalary.add(new Employee(3, "C", "AER", 24.5));
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice: ");
		System.out.println("1 - ID");
		System.out.println("2 - Name");
		System.out.println("3 - Department");
		System.out.println("4 - Salary");
		n = sc.nextInt();
		
		switch(n) {
		case 1->{
			System.out.println("Printing with ID sort.");
			for(Employee e : treeSetId) {
				System.out.println(e.getId() +" "+ e.getName()+" "+ e.getDept()+" "+ e.getSalary());
			}
		}
		case 2->{
			System.out.println("Printing with Name sort.");
			for(Employee e : treeSetName) {
				System.out.println(e.getId()+" "+ e.getName()+" "+ e.getDept()+" "+e.getSalary());
			}
		}
		case 3->{
			System.out.println("Printing with Department sort.");
			for(Employee e : treeSetDept) {
				System.out.println(e.getId()+" "+ e.getName()+" "+ e.getDept()+" "+e.getSalary());
			}
		}
		case 4->{
			System.out.println("Printing with Salary sort.");
			for(Employee e : treeSetSalary) {
				System.out.println(e.getId() +" "+ e.getName()+" "+ e.getDept()+" "+ e.getSalary());
			}
		}
		default->{
			System.out.println("Wrong number!");
		}
		}
	}

}
