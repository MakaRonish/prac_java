package linkdn;

public class Employee {
    private String name;
    private int age;
    private double salary;
    static String location = "Toronto";

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
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
