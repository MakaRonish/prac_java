class Shape {
    String color;

    public void printcolor() {
        System.out.println(this.color);
    }

}

class Triangle extends Shape {

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.printcolor();

    }
}
