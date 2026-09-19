package IO;
import java.io.FileNotFoundException;
import  java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoo {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("c:/users/pc/desktop/source/param.txt");
         int c;
        while (true) {
           
            if((c=fr.read())==-1){
                break;
            }
            System.out.print((char)c);
           
            
    }
     fr.close();
    }
    
}
