package Car_Rental;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {

    private static final AtomicInteger count = new AtomicInteger(98460);
    private String name;
    private long account_id;
    private double balance;

    public Account(String name, double balance) {
        this.account_id = count.incrementAndGet();
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public double getBalancec() {
        return this.balance;
    }

    public long getId() {
        return this.account_id;
    }

    @Override
    public String toString() {
        return String.format("Account id: %d\nName:%S\nBalance:%f", this.account_id, this.name, this.balance);
    }
}
