package Multithreading.RaceCondition;

public class Launch {
    public static void main(String[] args) {
        Account acc = new Account();
        MyThread myThread1 = new MyThread(acc);
          MyThread myThread2 = new MyThread(acc);
        myThread1.start();
        myThread2.start();
       try{
        myThread1.join();
        myThread2.join();

       } 
       catch(InterruptedException e){
        e.printStackTrace();
       }
       System.out.println(acc.s.length());
        
    }
    
}
