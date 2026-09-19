package IO;
import  java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String s = "param";
        try{

        
        FileWriter fw = new FileWriter("c:/users/pc/desktop/source/param.txt");
        fw.write(s);
        fw.close();
        }
        catch(IOException e){
           e.printStackTrace();

        }
    }
    
}
