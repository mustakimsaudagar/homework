package Array;

public class Reverse {
	
	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 40, 50};

	        int[] reverse = new int[arr.length];

	        int j = 0;

	        for (int i = arr.length - 1; i >= 0; i--) {
	            reverse[j] = arr[i];
	            j++;
	        }

	        for (int i = 0; i < reverse.length; i++) {
	            System.out.println(reverse[i]);
	        }
	    }
	
}
