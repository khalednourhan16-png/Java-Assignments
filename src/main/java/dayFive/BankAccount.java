package dayFive;

public class BankAccount {

     private double intialBalance=10000;
    private double balance=intialBalance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>0);
        this.balance+=balance;
    }}



//    BankAccount(double intialBalance)
//    {
//        this.balance=intialBalance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposite(double amount) {
//
//        if (amount>0)
//            balance+=amount;

//        }
//        }


