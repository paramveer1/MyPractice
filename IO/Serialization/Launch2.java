package IO.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class Launch2 {
    public static void main(String[] args) {


        Employee employee1 = new Employee(1, "param", 55000);
        File file = new File("c:/users/pc/desktop/OctPractice/EmployeeData");
        
        if(file.delete()){
            System.out.println("File Deleted");
        }
        else{
            System.out.println("File not deleted");
        }
                 file = new File("c:/users/pc/desktop/OctPracticeNew");

           
            if( file.mkdir()){
                System.out.println("Folder Created");
            }
            else{
                System.out.println("Folder Not Created");
            }
            

            file = new File("c:/users/pc/desktop/OctPracticeNew/EmployeeData");
        try{
             
             if(file.createNewFile()){
                System.out.println("File Created");
             }
             else{
                System.out.println("File not created");
             }
           
            
             FileOutputStream fis = new FileOutputStream("c:/users/pc/desktop/OctPractice/EmployeeData");
             ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(employee1);
        }
        catch(IOException e ){
            System.out.println("Exception Handled");

        }
        try{
        FileInputStream fis = new FileInputStream("c:/users/pc/desktop/OctPractice/EmployeeData");
        ObjectInputStream ois = new ObjectInputStream(fis);
      Employee e =  (Employee)ois.readObject();
      System.out.println(e.employee_no);
            System.out.println(e.name);
                  System.out.println(e.salary);


        }
        catch(IOException |ClassNotFoundException a){
            System.out.println(a);


        }

        
    }
    
}
