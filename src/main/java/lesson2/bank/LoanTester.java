package lesson2.bank;

public class LoanTester {
    public static void main(String[] args) {
    Account account = new Account("123df","Yauheni",20_000);
    account.debit(10_000);
    account.credit(25_000);
    account.transfer(account, 5_000);
    }
}
