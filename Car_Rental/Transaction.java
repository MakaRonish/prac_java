package Car_Rental;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaction {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Account> Bank = new ArrayList<>();

    public long registerAccount() {

        System.out.println("Welcome to register for an account ");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        Account account = new Account(name, 0);
        System.out.printf("Account Created\nName: %s\nAccount Number: %d\nBalance: %f: ", account.getName(),
                account.getId(), account.getBalancec());
        System.out.println("");
        Bank.add(account);
        return account.getId();
    }

    public void addBalance(double balance, long id) {
        for (Account acc : Bank) {
            if (acc.getId() == id) {
                acc.setBalance(balance);
                break;
            }
        }

    }

    public int accountFinder(long id) {
        int length = Bank.size();
        int p1 = 0;
        int p2 = length - 1;
        int middle;
        while (p1 <= p2) {
            middle = (p1 + p2) / 2;
            if (Bank.get(middle).getId() == id) {
                return middle;
            } else if (id > Bank.get(middle).getId()) {
                p1 = middle + 1;
            } else {
                p2 = middle - 1;
            }
        }
        ;
        return -1;

    }

    public Transaction() {
        Bank.add(new Account("Ronish", 9990000));
        Bank.add(new Account("Priya", 2500));
        Bank.add(new Account("Rey", 1500));
        Bank.add(new Account("Ashim", 3000));
        Bank.add(new Account("Kushal", 500));
        for (Account acc : Bank) {
            System.out.println(acc);
        }
    }

    public static void main(String[] args) {

    }
}
