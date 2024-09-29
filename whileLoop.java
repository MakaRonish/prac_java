import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        while (name.isBlank()) {
            System.out.println("name");
            name = scanner.nextLine();

        }

    }
}
