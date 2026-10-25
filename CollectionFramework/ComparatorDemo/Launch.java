package CollectionFramework.ComparatorDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Launch {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"param",(byte)25,80000);
        Employee employee2 = new Employee(2,"Shanu",(byte)30,55000);
        Employee employee3 = new Employee(3,"Deepa",(byte)28,25000);

        Employee employee4 = new Employee(4,"Dashrath",(byte)32,40000);

        Employee employee5 = new Employee(5,"Aarti",(byte)28,40000);

        TreeSet<Employee> treeSet = new TreeSet <Employee>(new MyComparator());
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);
        System.out.println(treeSet);
    }

}
