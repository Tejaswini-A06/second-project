package Bank;

public class BankAccount1 {
    public double balance = 10000;
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {


        BankAccount1 obj = new BankAccount1();
        System.out.println(obj.getBalance());
    }
}