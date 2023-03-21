package Ttutorial;

public class Tester {
    public static void main(String[] args) {
        Account a = new Account() {
            @Override
            public int deposit(int a) {
                return 0;
            }

            @Override
            public boolean withdraw(int b) {
                return false;
            }
        };
    }
}
