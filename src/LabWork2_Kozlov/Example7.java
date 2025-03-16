package LabWork2_Kozlov;

interface BankAccountInterface {
    void deposit(double amount);
    int getBalance();
    boolean withdraw(int amount);
}

class BankAccount implements BankAccountInterface {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие успешно выполнено. Новый баланс: " + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Недостаточно средств на счете!");
            return false;
        } else {
            System.out.println("Сумма снятия должна быть положительной!");
            return false;
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }
}