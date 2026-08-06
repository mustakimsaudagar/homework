package OOPS;

public class Customer1 extends User4 implements Transaction1{

    Account account;

    Customer1(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void TransferMoney() {

        System.out.println(name + " transferred ₹5000 using Mobile Banking");
        System.out.println("Account No : " + account.getAccountNo());
        System.out.println("Balance : ₹" + account.getbalance());
    }
}

