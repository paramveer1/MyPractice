package IO.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Launch {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"param" ,55000 );
      File file = new File("c:/users/pc/desktop/Deepa");
      
      if(file.mkdir()){
        System.out.println("Folder created sucessfully");
      }
      else{
        System.out.println("Folder not created");
      }
             file = new File("c:/users/pc/desktop/Deepa/sandip");

      try{
        if(file.createNewFile()){
            System.out.println("File created sucessfullly");
        }
        else{
            System.out.println("File not created");
        }      }
      catch(IOException e){
        System.out.println(e);
      }
        try{
            FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/Deepa/sandip");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            System.out.println("Serialization done ");
            FileInputStream fis = new FileInputStream("c:/users/pc/desktop/Deepa/sandip");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee e = (Employee)ois.readObject();
            System.out.println(e.employee_no +" "+  e.name + " "+ e.salary);
             


        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
