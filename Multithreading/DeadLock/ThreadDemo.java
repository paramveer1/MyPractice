package Multithreading.DeadLock;

 class ThreadDemo extends Thread {
    String r1 = "param" ;
    String r2= "shanu";
    String r3 = "deepaa";
    
    public void run(){
       String name = currentThread().getName();
        if(name.equals("Thread-0"))
        {
            thread0Access();

        }
        else{
            thread1Access();

        }

    }
    void thread0Access(){

        synchronized (r1){
            System.out.println("r1= "+r1+ currentThread().getName());
             synchronized (r2){
            System.out.println("r2= "+r2+ currentThread().getName());
        //      synchronized (r3){
        //     System.out.println("r3= "+r3+ currentThread().getName());
        //      System.out.println("hi");

        // }

        }

        }
        
        

    }
  void thread1Access(){
    //  synchronized (r3){
    //         System.out.println("r3= "+r3+ currentThread().getName());
             synchronized (r2){
            System.out.println("r2= "+r2+ currentThread().getName());
             synchronized (r1){
            System.out.println("r1= "+r1+ currentThread().getName());

        }
            
        System.out.println("hi");

        }

        // }
   
        
        

  }

    
}
