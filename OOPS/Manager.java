package OOPS;

public class Manager extends User4 implements Transaction1{

	Account account;

    Manager(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void TransferMoney() {

        System.out.println(name + " approved High Value Transfer");
        System.out.println("Account No : " + account.getAccountNo());
        System.out.println("Balance : ₹" + account.getbalance());
    }
}
