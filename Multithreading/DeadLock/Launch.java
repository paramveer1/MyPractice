package Multithreading.DeadLock;

public class Launch {
    public static void main(String[] args) {
        ThreadDemo  threadDemo = new ThreadDemo();
        ThreadDemo  threadDemo1 = new ThreadDemo();
        threadDemo.start();
        threadDemo1.start();
        
    }
    
}
