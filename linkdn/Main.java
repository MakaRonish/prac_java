package linkdn;

public class Main {
    public static void main(String[] args) {
        // Tree myOakTree= new Tree(120,5,TreeType.OAK);
        // Tree mymappleTree= new Tree(25,5,TreeType.MAPLE);
        // myOakTree.announceTallTree();
        // mymappleTree.announceTallTree();

        Employee e1= new Employee("Ronish",22,1199);
        Employee e2= new Employee("priya",22,1199);

        e1.raiseSalary();
        System.out.println(e1);
        System.out.println(e2);
    }
    
}
