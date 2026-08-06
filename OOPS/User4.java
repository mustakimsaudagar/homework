package OOPS;

abstract class User4 {
	
    String name;

    
    static String bankName = "State Bank of India";

    User4(String name) {
        this.name = name;
    }

    abstract void TransferMoney();

    static void displayBank() {
        System.out.println("Bank Name : " + bankName);
    }

}
