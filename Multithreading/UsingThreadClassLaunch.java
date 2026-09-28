package Multithreading;

public class UsingThreadClassLaunch {
    public static void main(String[] args) {
        Table5 table5 = new Table5();
        Table2 table2 = new Table2();
        Thread thread = new Thread(table5);
        Thread thread2 = new Thread(table2);
        // System.out.println(thread2.currentThread().getName());
        thread.setName("param Thread");
        thread2.setName("shanu Thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(1);

        thread2.start();
        thread.start();
       try{
        thread2.join();
        thread.join();
       } 
       catch(InterruptedException e){
        System.out.println(e);
       }
        System.out.println("hi");
        
    }
    
}
