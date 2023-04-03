package lesson2.bank;

public class Account {
    private String id;
    private String owner;
    private int balance;

    public Account(String id, String owner, int balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }


    public int debit(int money){
        if(money<0){
            System.out.println("Отрицательная сумма для дебита");
        }else{
            balance += money;

        }
        return balance;
    }

    public int credit(int money){
        if(money > balance){
            System.out.println("Сумма больше баланса");
            return 0;
        }
        balance -= money;

        return balance;
    }

    public int transfer(Account account, int amount){
        if(account.balance < amount){
            System.out.println("Сумма перевода больше баланса");
        }else{
            account.balance -= amount;
        }
        return account.balance;
    }
}
