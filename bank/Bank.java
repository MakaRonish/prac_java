package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        setPasswprd("pass");
        return this.password;
    }

    private void setPasswprd(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Ronish";
        account1.email = "@gmail";

        System.out.println(account1.getPassword());
    }

}
