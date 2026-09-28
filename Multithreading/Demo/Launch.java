package Multithreading.Demo;

public class Launch extends Thread {


    public static void main(String[] args) {
        Launch two = new Launch();
        Launch five = new Launch();
        Launch eight = new Launch();
        two.setName("two");
        five.setName("five");
        eight.setName("eight");

        two.start();
        five.start();
        eight.start();



        
    }

    public void run(){
        String name = currentThread().getName();
        if(name.equals("two")){
            table(2,name);
        }
         if(name.equals("five")){
            table(5,name);
        }
         if(name.equals("eight")){
            table(8,name);
        }


    }

    public void table(int num,String name){
        for(int i = 1;i<11;i++){
            System.out.println(num*i+ "  "+name);

        }

    }
    
}
