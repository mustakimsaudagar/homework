package Array;

public class Search {

	public static void main(String[] args) {
		
		int [] arr = {1,2,33,44,65,76,88};
		
		int search = 88;
		
		for (int i = 0;i<arr.length;i++) {
			
			if (arr[i]==search) {
				
				System.out.println("found");
			}
		}
	}
}
