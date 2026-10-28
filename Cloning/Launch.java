package Cloning;
import CollectionFramework.ComparatorDemo.Employee;

public class Launch  {
    public static void main(String[] args)throws CloneNotSupportedException {
        Employee e = new Employee(2,"param",(byte)22,99999);
      Employee eClone = (Employee) e.clone();
      System.out.println(eClone);
        
    }
    
}
