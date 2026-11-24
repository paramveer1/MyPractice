package CollectionFramework.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(Arrays.asList(4,9,67,53));
        al.add(5);
        al.add(55);
        al.add(589);
       

       
       

        ListIterator  itr = al.listIterator();
        System.out.println(al);
        while(itr.hasNext()){
         
          System.out.println(itr.next());
          
         
        

        }
        while(itr.hasPrevious()){
            itr.add(7777);
           
            System.out.println(itr.previous());

        }
       


    }
    
}
