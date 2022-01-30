class SearchArray{
	boolean b = false;
	public boolean searchArray(int[] arr,int toCheckValue){
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==toCheckValue) {
				b = true;
				System.out.print("Found.");
			}
		}
		System.out.print("Not Found.");
		return b;
	}
}
public class Assignment1Q7 {
	public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 0;
        SearchArray a = new SearchArray();
        a.searchArray(arr, valueToCheck);
      }
}

