package Multithreading.RaceCondition;

public class Account {
      StringBuffer s = new StringBuffer();
      // String s = "";
      // String p = "";
      int count ;
      int race;
        void addString(){
        s=s.append("a");
        // s= s+"a";
        synchronized(this){
          count++;

        }
        race++;
        // System.out.println("hi"+Thread.currentThread().getName());
      }
	 
    
}
