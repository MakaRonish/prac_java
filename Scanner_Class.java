import java.util.Scanner;

public class Scanner_Class {
    public static void main(Stringjj[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name=");
        Stringjj name = scanner.nextLine();
        System.out.println("Age?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("hobby");
        Stringjj hobby = scanner.nextLine();
        System.out.println("your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your hobby is " + hobby);

    }

}
