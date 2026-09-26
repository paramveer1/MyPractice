package CollectionFramework;
import  java.util.List;
import java.util.ArrayList;
import  java.util.LinkedList;
import  java.util.Iterator;
import  java.util.Arrays;
import  java.util.ListIterator;
import  java.util.Stack;
import  java.util.HashMap;
import  java.util.Map;
import  java.util.Collection;
import java.util.Set;


public class Demo {

public static void main(String[] args) {

    Map<Integer,String> map =  new HashMap<>();
    map.put(4,"param");
    map.put(2,"pushpa");
    map.put(1,"shanu");
    map.put(3,"Deepa");

     Set<Map.Entry<Integer,String>> entries = map.entrySet();
     for(Map.Entry<Integer,String> o :entries){
        // System.out.print(o.getKey()+ " = "+o.getValue()+ "     ");

     }
     Iterator itr = entries.iterator();
     while(itr.hasNext()){
        System.out.println(itr.next());

     }
    //  System.out.println(map);


   
    
}



       
    }

      
       

