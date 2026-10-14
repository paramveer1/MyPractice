package Multithreading.SenderReceiverProblem;
class MyThread extends Thread{
    User user ;
    MyThread(User user){
        this.user = user;

    }
   

    public  void run(){
        String name = currentThread().getName();
        if(name.equals("Thread-0")){
         
            for(int i = 1;i<=5;i++){
                 user.rajuAccess(i);

                
                
                 
               
           

        }
    }
        else{
             for(int i = 1;i<=5;i++){
                 user.kajuAccess(i);
                
                
                
            }

        }

    }



    // void sender(){
    //     message


    // }
    //  void Receiver(){
    //     message


    // }
}

