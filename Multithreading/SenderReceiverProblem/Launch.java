package Multithreading.SenderReceiverProblem;
class Launch{
    
    public static void main(String[] args) {
        User user = new User();
        MyThread myThread1 =  new MyThread(user);
        MyThread myThread2 =  new MyThread(user);
        myThread1.start();
                myThread2.start();


    }

}