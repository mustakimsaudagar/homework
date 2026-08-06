package OOPS;

public class Main6 {

    public static void main(String[] args) {

        Account1 acc = new Account1();

        acc.setAccountNo(123456);
        acc.setBalance(50000);

        
        User4.displayBank();

        System.out.println("----------------");

        Customer1 c = new Customer1("Mustakim", acc);

        c.TransferMoney();

        System.out.println("----------------");

        Manager m = new Manager("Rahul", acc);

        m.TransferMoney();
    }
}

