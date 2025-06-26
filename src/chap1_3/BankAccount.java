package chap1_3;

public class BankAccount {
    int accountNumber;
    String owner;
    double balance;

    BankAccount(int aNum, String aOwner, int bNum) {
        accountNumber = aNum;
        owner = aOwner;
        balance = bNum;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.printf("잔고에 %.0f원이 입금 되었습니다. 현재 잔고는 %.0f원 입니다.%n", amount, balance);
    }

    void withdraw(double amount) {

    }

    void displayBalance() {

    }
}
