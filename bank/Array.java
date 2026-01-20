public class Array {

    public static void main(String[] args) {
        String[] cars = { "camero", "Honda", "civic" };

        cars[0] = "mustang";
        System.out.println(cars[0]);

        String[] gadi = new String[5];
        gadi[0] = "camero";
        gadi[1] = "camero1";
        gadi[2] = "camero2";
        gadi[3] = "camero3";
        gadi[4] = "camero4";

        for (int i = 0; i < gadi.length; i++) {
            System.out.print(gadi[i] + ",");

        }

    }
}
