import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> name = new ArrayList<>();

        ArrayList<String> bakery = new ArrayList<>();
        bakery.add("pasta");
        bakery.add("garlic");
        bakery.add("donut");

        ArrayList<String> produce = new ArrayList<>();
        produce.add("tomato");
        produce.add("zucchini");
        produce.add("peppers");
        ArrayList<String> drink = new ArrayList<>();
        drink.add("soda");
        drink.add("coffee");

        name.add(bakery);
        name.add(produce);
        name.add(drink);

        name.get(0).add("gg");
        System.out.println(name);

        for (ArrayList<String> i : name) {
            for (String j : i) {
                System.out.println(j);
            }

        }

    }

}
