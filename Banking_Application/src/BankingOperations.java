class BankingOperations {
    private String mobileNumber;
    private String name;
    private double balance;

    public BankingOperations(String mobileNumber, String name) {
        this.mobileNumber = mobileNumber;
        this.name = name;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance =balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance =balance - amount;
        }
    }
}

          