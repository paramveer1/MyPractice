package Multithreading.RaceCondition;

public class MyThread extends Thread {
    Account acc ;
    MyThread(Account acc){
       this.acc=acc;
    }
  
    public   void run(){
        for(int i = 1;i<= 50000;i++){
            acc.addString();
        }
       


    }
    
}
