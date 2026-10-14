package ExceptionHandling.CustomException;
import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        System.out.println("Enter Your Age ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<18)



        throw new AgeValidation("Not Eligible for Voting");
        else System.out.println(" Eligible ");
    }
    
}
