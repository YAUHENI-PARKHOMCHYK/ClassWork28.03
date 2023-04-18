package lesson2.bank;

public class LoanTester {

        public static void main(String[] args) {
            Account a1 = new Account("123", "Misha Semenov", 30);
            Account a2 = new Account("456", "Sergey Petrov", 45);
            a1.transfer(a2, 15);
            System.out.println(a1.getBalance());
            System.out.println(a2.getBalance());
        }



}
