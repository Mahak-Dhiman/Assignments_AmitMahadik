import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return totalDeposits;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits+fixedDepositAmount;
    }
}
public class Assignment2Q3 {

	public int totalCashInBank(ArrayList<Integer> cash){
		int count = 0;
		for(int i: cash) {
			//System.out.println(i);
			count = count + i;
		}
		System.out.println("Total cash in both: " + count);
		return count;
	}
    public int getCash(){
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Q3 a = new Assignment2Q3();
		ArrayList<Integer> cash = new ArrayList<>();
		Assignment2Q3 savingsAccount = new SavingsAccount();
		Assignment2Q3 currentAccount = new CurrentAccount();

		cash.add(savingsAccount.getCash());
		cash.add(currentAccount.getCash());
		a.getCash();
		a.totalCashInBank(cash);
	}

}
