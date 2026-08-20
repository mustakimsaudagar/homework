package Array;

public class Average {

	public static void main(String[] args) {
		
		int[]arr= {20,20,30,10,20};
		
		int sum = 0;
		
		for (int i = 0 ; i<arr.length;i++) {
			
			sum = sum+arr[i];
			
		}
		
		double average = sum/arr.length;
		
		System.out.println("avg="+average);
	}
}
