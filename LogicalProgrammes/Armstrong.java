package LogicalProgrammes;
import  java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check Armstrong");
      int  a = sc.nextInt();
      int temp = a;
      int count =0;
      while(temp!=0){
        count++;
        temp = temp/10;


      }
      
temp = a;
int arm = 0;
while (temp!=0) {
    int rem = temp%10;
    int mul = 1;
    for(int i = 1;i<=count;i++){
      mul =   rem*mul;

    }
    arm = arm+mul;

    temp = temp/10;



    
}

if(arm==a){
    System.out.println("No is Armstrong");
}
else{
    System.out.println("Not Armstrong");
}


        
    }
    
}
