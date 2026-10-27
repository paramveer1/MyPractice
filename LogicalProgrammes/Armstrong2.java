package LogicalProgrammes;
import  java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        System.out.println("Enter no to check Armstrong");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int temp = a;
        int arm = 0;
        while(temp!=0){
            count++;
            temp = temp/10;
        }
        temp = a;
        while(temp!=0){
            int rem = temp%10;
            int mul = 1;
            for(int i = 1;i<= count;i++){
                mul = mul * rem;

            }
            arm = arm+mul;

            temp = temp/10;
        }
        if(a==arm){
            System.out.println("No is Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
