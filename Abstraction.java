abstract class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("Animal eat");
    }

    Animal() {
        System.out.println("you are creating a new animal");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks in 4 leg");
    }

    Horse() {
        System.out.println("you are creating a new horse");
    }
}

class chicken extends Animal {
    public void walk() {
        System.out.println("Walks in 2 leg");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }
}
