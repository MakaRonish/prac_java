public class methods {
    public static void main(String[] args) {
        hello("ronish", 20);
        int x = 3;
        int y = 7;
        int sum = sum(12, 90);
        System.out.println(sum);

    }

    static void hello(String name, int age) {
        System.out.println("hello " + name);
        System.out.println("age: " + age);
    }

    static int sum(int x, int y) {
        return x + y;

    }

}
