package LogicalProgrammes;
import  java.util.Scanner;

public class PallindromeNO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number to Check Pallindrome");
        int a = sc.nextInt();
        int temp = a;
        int rev = 0;
        while(temp != 0){
            int rem = temp%10;
            rev = rev*10 + rem;




            temp=temp/10;

        }
        if(a==rev){
            System.out.println("no is Pallindrome");
        }
        else{
            System.out.println("not Pallindrome");
        }
        
    }
    
}
