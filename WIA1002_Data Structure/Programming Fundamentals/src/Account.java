import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){

    }
    Account(int id, double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100) / 12;
    }

    public double getMonthyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double draw){
       balance -= draw;
    }
    public void deposit(double plus){
        balance += plus;
    }
}
class Tester{
    public static void main(String[] args) {
        Account a = new Account(1122, 20000,4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.printf("Balance: %.2f", a.getBalance());
        System.out.printf("\nMonthly interest: %.2f", a.getMonthyInterest());
        System.out.printf("\nDate created: %s", a.getDateCreated());
    }
}


