package bankA;

public class BankAccount {
    private double balance=10000;

    public double getBalance()
    {
        return balance;
    }

    public static void main(String[] args){
        BankAccount obj=new BankAccount();
        System.out.println(obj.getBalance());

    }
}
