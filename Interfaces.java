interface Animal {
    void walk();

    void eat();
}

interface herbi {

}

class Horse implements Animal, herbi {
    public void walk() {
        System.out.println("4");
    }

    public void eat() {
        System.out.println("eat");
    }
}

class Student {
    public String name;
    static String School;

    public static void change() {
        School = "newschool";

    }
}

public class Interfaces {
    public static void main(String[] args) {
        Student.School = "vvs";
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.name);
        System.out.println(s2.School);
    }

}
