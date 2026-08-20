package Array;

public class Minimum {

	public static void main(String[] args) {
		
		int [] arr = {11,22,33,44,55};
		
		int min = arr[0];
		
		for (int i = 1 ; i<arr.length;i++) {
			
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("minumum no = "+min);
	}
}
