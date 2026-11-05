package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("C:/users/pc/desktop/NovPractice");
       if(file.mkdir()) {
        System.out.println("Folder created successfully");
       }
       else{
        System.out.println("Folder Not created");
       }



    //    FileWriting
       try{
                FileOutputStream fos = new FileOutputStream("c:/users/pc/desktop/NovPractice/param",true);
                String s = "param";
             fos.write(s.getBytes());
             System.out.println("File Written succesfully");


       }
       catch(IOException e){
        System.out.println(e);
       }
    }
    
}
