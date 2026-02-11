package linkdn;

public class Employee {
    String name;
    int age;
    double salary;
    static String location = "Toronto";

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void raiseSalary() {
        this.salary += 10000;
    }

    @Override
    public String toString() {

        return "name" + this.name + "\n" + "age" + this.age + "\n" + "salary" + this.salary + "\n" + "Location"
                + this.location + "\n";
    }

}
