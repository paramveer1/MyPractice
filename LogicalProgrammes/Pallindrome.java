package LogicalProgrammes;
import  java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev ="";
        // for(int i = s.length()-1;i>= 0;i--){
            for(int i =0;i<=s.length()-1;i++){
             rev = s.charAt(i)+ rev;

        }
        if(s.equals(rev)){
            System.out.println("Pallindrome");
        }
            else{
                System.out.println("Not pallindrome");
            }
        }
        

        
    }
    

