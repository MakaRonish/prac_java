package linkdn;

public class Ba {
    private String owner;
    private double balance;

    public Ba(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;

    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;

    }

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("Amount deposited: " + balance);
        System.out.println("New balance: " + this.balance);
    }

    public void withdraw(double balance) {
        if (this.balance > balance) {

            this.balance -= balance;
            System.out.println("Amount withdraw: " + balance);
        } else {

            System.out.println("Not enough to withdraw ");
        }
        System.out.println("Total balance: " + this.balance);

    }

}
