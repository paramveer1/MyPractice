package Multithreading.SenderReceiverProblem;

public class User {
    String message ;
    boolean b ;
    synchronized void rajuAccess(int i){
        message =  "hello "+i;
        System.out.println(message +   " sent by raju");
        b=true;
        notify();
        try{
            wait();


    }
    catch(InterruptedException e){
        System.out.println(e);
    }
    
}
      synchronized void kajuAccess(int i){
        if(b){
              System.out.println(message +   " received by kaju");
        notify();
        b=false;
       try{
            wait();


    }
    catch(InterruptedException e){
        System.out.println(e);
    }

        }
      
      

    }

	

    
}

