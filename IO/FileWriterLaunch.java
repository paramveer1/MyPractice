package IO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterLaunch {
    public static void main(String[] args) {
        String s = "param";
        try{
        FileWriter fw = new FileWriter("c:/users/Pc/desktop/OctPractice/param.txt");
        fw.write(s);
        fw.close();
       FileReader fr = new FileReader("c:/users/Pc/desktop/OctPractice/param.txt");
            int a ;
       while(( a  = fr.read()) != -1){
        System.out.print((char)a);



       }
      
       

        }
        catch(IOException e){
            System.out.println(e);

        }
    }
    
}
