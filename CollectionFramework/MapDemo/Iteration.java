package CollectionFramework.MapDemo;
import java.util.HashMap;
import java.util.Iterator;
import  java.util.Set;
import java.util.Map.Entry;
// import  java.util.Entry;

public class Iteration {
    public static void main(String[] args) { 
        HashMap hashmap = new HashMap();
        hashmap.put("param",8);
        hashmap.put("ram",5);
Set<Entry> set =  hashmap.entrySet();
       Iterator itr =set.iterator();
       System.out.println(hashmap.keySet());
for(Entry e : set){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}

       while(itr.hasNext()){
        Object obj = itr.next();
        System.out.println(obj);
    




        itr.remove();
        

       }
    
    

      

        
    }
    
}
