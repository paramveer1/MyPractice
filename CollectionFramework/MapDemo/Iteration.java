package CollectionFramework.MapDemo;
import java.util.HashMap;
import  java.util.Set;
import java.util.Map.Entry;
// import  java.util.Entry;

public class Iteration {
    public static void main(String[] args) { 
        HashMap hashmap = new HashMap();
        hashmap.put("param",8);
        hashmap.put("ram",5);
        System.out.println(hashmap);
     Set<Entry> set =  hashmap.entrySet();
        System.out.println( );
        System.out.println(set);
        for(Object o  : set){
            System.out.println(o);
            
        }

        
    }
    
}
