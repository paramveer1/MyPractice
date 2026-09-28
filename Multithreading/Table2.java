package Multithreading;

public class Table2 implements Runnable {
    public void run(){
        for(int i =1;i<11;i++){

            System.out.println(2*i +"  " +Thread.currentThread().getName());
           try{
            Thread.sleep(1000);
           } 
           catch(InterruptedException e){
            System.out.println(e);
           }
        }
    }
    
}
