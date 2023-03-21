package Ttutorial;

public class BankAccount implements Account{
    private  int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }


    @Override
    public int deposit(int a) {
        balance+=a;
        return balance;
    }

    @Override
    public boolean withdraw(int b) {
        if (b<=balance){
            balance-=b;
            return true;
        }
        else
            return false;
    }


}
