package LogicalProgrammes;
import  java.util.Scanner;

public class PallindromeStringUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check Pallindrome");
        String a = sc.next();
        String s = sc.nextLine();
        s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        if(s.equals(rev)){
            System.out.println("String is Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }

        
        
    }
    
}
