abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	System.out.println("File Persistence.");
    	return null;
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	System.out.println("Database Persistence.");
    	return null;
    }
}
class Client{
	Persistence p = new FilePersistence();
	Persistence d = new DatabasePersistence();
	public void get() {
		p.persist();
		d.persist();
	}
}
public class Assignment2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		c.get();

	}

}
