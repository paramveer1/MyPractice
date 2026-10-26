package IO.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Launch2 {
    public static void main(String[] args) {


        Employee employee1 = new Employee(1, "param", 55000);
        File file = new File("c:/users/pc/desktop/OctPractice");
        
      

           
            if( file.mkdir()){
                System.out.println("Folder Created");
            }
            else{
                System.out.println("Folder Not Created");
            }
              if(file.delete()){
            System.out.println("File Deleted");
        }
        else{
            System.out.println("File not deleted");
        }

            file = new File("c:/users/pc/desktop/OctPractice/EmployeeData");
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
       

        
    }
    
}
