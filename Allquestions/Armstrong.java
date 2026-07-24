package Allquestions;

public class Armstrong {
	
	static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int count = String.valueOf(num).length(); // Count digits

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
	
		

		
		
		
	

