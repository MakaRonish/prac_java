package linkdn;

public class Main {
    public static void main(String[] args) {
        // Tree myOakTree= new Tree(120,5,TreeType.OAK);
        // Tree mymappleTree= new Tree(25,5,TreeType.MAPLE);
        // myOakTree.announceTallTree();
        // mymappleTree.announceTallTree();

        // Employee e1= new Employee("Ronish",22,1199);
        // Employee e2= new Employee("priya",22,1199);

        // e1.raiseSalary();
        // System.out.println(e1);
        // System.out.println(e2);

        Ba a1= new Ba("Ronish",1000);
        a1.withdraw(99999);
        a1.withdraw(500);

        ModArrayList listy= new ModArrayList<>();
        listy.add(0);
        listy.add(1);
        listy.add(2);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-1));

    }
    
}
