public class printf {
    public static void main(String[] args) {
        System.out.printf("this %dis format ", 123);
        boolean my = true;
        char ch = '@';
        String st = "ronish";
        int in = 90;
        System.out.printf("abc %b", my);
        System.out.printf("abc %c", ch);
        System.err.println();
        System.out.printf("abc%-10s", st);
        System.out.printf("%.2f", 12.989999);
        System.out.printf("%020f", 12.989999);

    }

}
