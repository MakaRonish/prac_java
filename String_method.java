public class String_method {
    public static void main(String[] args) {
        String name = "Ronish";

        boolean result = name.equals("Ronish");
        System.out.println(result);
        boolean result2 = name.equalsIgnoreCase("RoNish");
        System.out.println(result2);

        int len = name.length();
        System.out.println(len);
        char chars = name.charAt(0);
        System.out.println(chars);
        int index = name.indexOf("n");
        System.out.println(index);
        String upp = name.toUpperCase();
        System.out.println(upp);
        String low = name.toLowerCase();
        System.out.println(low);
        String r = name.trim();

        String re = name.replace("R", "N");
        System.out.println(re);
    }
}