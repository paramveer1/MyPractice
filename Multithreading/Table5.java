package Multithreading;

public class Table5 implements Runnable{
    @Override 
   public void run(){
    for(int i = 1;i<=10;i++){
        System.out.println(5*i +"  "+ Thread.currentThread().getName());
         try{
            Thread.sleep(1000);
           } 
           catch(InterruptedException e){
            System.out.println(e);
           }
       
    }

    }
    
}
