public class Array2D {
    public static void main(String[] args) {
        String[][] car = new String[3][3];

        car[0][0] = "Camero";
        car[0][1] = "Corvette";
        car[0][2] = "Silverato";
        car[1][0] = "Mustang";
        car[1][1] = "ranger";
        car[1][2] = "f-150";
        car[2][0] = "ferrai";
        car[2][1] = "lambo";
        car[2][2] = "tesla";

        for (int i = 0; i < car.length; i++) {
            for (int j = 0; j < car[i].length; j++) {
                System.err.print(car[i][j] + " ");
            }
            System.err.println();

        }
        String[][] gadi = { { "a", "b", "c" },
                { "d", "e", "f" },
                { "g", "h", "i" } };
    }
}
