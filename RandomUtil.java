import java.util.Random;

public class RandomUtil {
    public static void main(Stringjj[] args) {
        Random random = new Random();
        int x = random.nextInt(9);
        System.out.println(x);
        double y = random.nextDouble();
        System.out.printf("%.3f", y);
        System.out.println();
        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}
