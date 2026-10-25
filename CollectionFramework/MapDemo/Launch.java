package CollectionFramework.MapDemo;
import  java.util.HashMap;
import java.util.Map;
class Launch{
    public static void main(String[] args) {
        HashMap <Integer,String> hashmap = new HashMap();
        hashmap.put(1,"param");
        hashmap.put(2,"shanu");
         hashmap.put(3,"anu");
          for(Map.Entry entry: hashmap.entrySet()){
           
            System.out.println( entry.getKey());

          }

    }

}