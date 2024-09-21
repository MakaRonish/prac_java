public class Swaping_var {
    public static void main(String[] args) {
        String x = "q";
        String y = "qat";

        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

    }
}
