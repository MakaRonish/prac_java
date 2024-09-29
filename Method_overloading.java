public class Method_overloading {
    public static void main(String[] args) {
        double a = add(1.1, 2.1);
        System.out.println(a);
    }

    static int add(int a, int b) {
        System.out.println("m1");
        return a + b;

    }

    static double add(double a, double b) {
        System.out.println("m1 double");
        return a + b;

    }

    static int add(int a, int b, int c) {
        System.out.println("m2");
        return a + b + c;

    }

    static int add(int a, int b, int c, int d) {
        System.out.println("m3");
        return a + b + c + d;

    }

}
