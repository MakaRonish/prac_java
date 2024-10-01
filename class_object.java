
import java.util.Scanner;

// blue print
class Pen {
    String color;
    String type;

    public void write() {
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what you want to write:");
        word = scanner.nextLine();
        System.out.println(word);

    }

    public void printColor() {
        System.out.println((this.color));
    }
}

class Student {
    String Name;
    int Age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
    // public void printName() {
    // System.out.println(this.Name);
    // }

    // public void printAge() {
    // System.out.println(this.Age);
    // }
    // // non parameter
    // // Student() {
    // // System.out.println("constructor");
    // // }

    // Student(Student s2) {
    // this.Name = s2.Name;
    // this.Age = s2.Age;
    // }

    // Student() {

    // }
}

public class class_object {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "red";
        // pen1.type = "gel";
        // Pen pen2 = new Pen();
        // pen2.color = "blue";
        // pen2.type = "ball";

        // pen1.printColor();
        // ;
        // pen2.printColor();
        // ;
        Student s1 = new Student();
        s1.Name = "Ronish Makaju";
        s1.Age = 20;

        s1.printInfo(s1.Name, s1.Age);
        // Student s2 = new Student(s1);
        // s2.printAge();
        // s2.printName();
        // s1.printAge();
        // s1.printName();
    }
}
