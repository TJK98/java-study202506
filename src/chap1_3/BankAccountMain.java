package chap1_3;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount wang = new BankAccount(123123123, "왕택준", 50000);
        wang.deposit(10000);
    }
}
