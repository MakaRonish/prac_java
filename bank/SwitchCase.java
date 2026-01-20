import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day:");
        day = scanner.nextLine();
        switch (day) {
            case "sunday":
                System.out.println("sunday");
                break;
            case "monday":
                System.out.println("monday");
                break;
            case "tuesday":
                System.out.println("tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            case "thursday":
                System.out.println("thursday");
                break;
            case "friday":
                System.out.println("fridauy");
                break;
            case "satuday":
                System.out.println("saturday");
                break;
            default:
                System.out.println("not valid day");
        }
    }
}