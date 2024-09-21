import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x=");
        int x = scanner.nextInt();
        System.out.println("Enter side y=");
        int y = scanner.nextInt();
        System.out.println(double(x / y));
    }
}
