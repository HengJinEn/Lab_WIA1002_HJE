import java.util.ArrayList;
import java.util.Date;

public class Account1 {
    private int id;
    private double balance;
    private double annualInterestRate = 1.5;
    private String name;

    public Account1(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }
// Class [] c = new Class[7];
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100) / 12;
    }

    public double getMonthyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double draw){
        balance -= draw;
        transactions.add(new Transaction('W',draw,balance,"Withdraw"));
    }
    public void deposit(double plus){
        balance += plus;
        transactions.add(new Transaction('D',plus,balance,"Deposit"));
    }

    public String getName() {
        return name;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

}

class Transaction{
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date = new Date();
    private char type;
    private double amount;
    private double balance;
    private String description;


    Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class Test{
    public static void main(String[] args) {
        Account1 a = new Account1(1122, 1000,"George");
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        System.out.println("Name: " +a.getName());
        System.out.println("Interest Rate: " + a.getAnnualInterestRate());
        System.out.println("Balance: " + a.getBalance());
        System.out.println();
        for (int i = 0; i < a.transactions.size(); i++) {
            System.out.println("Date of this transaction : " + a.transactions.get(i).getDate());
            System.out.println("Type of this transaction : " + a.transactions.get(i).getType());
            System.out.println("Amount of this transaction : " + a.transactions.get(i).getAmount());
            System.out.println("New Balance of this transaction : " + a.transactions.get(i).getBalance() );
            System.out.println("Description of this transaction : " + a.transactions.get(i).getDescription());
            System.out.println();
        }

    }
}

