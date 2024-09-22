import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x=");
        double x = scanner.nextDouble();
        System.out.println("Enter side y=");
        double y = scanner.nextDouble();
        double hyp = Math.sqrt((x * x + y * y));
        System.out.println(hyp);
        System.err.printf("%.2f", hyp);
    }
}
