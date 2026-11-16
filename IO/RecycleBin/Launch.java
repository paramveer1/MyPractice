package IO.RecycleBin;
import java.io.File;
import java.io.IOException;

public class Launch {
    public static void main(String[] args) {
        File file = new File("c:/users/pc/desktop/NovFolder");
        file.mkdir();
        file =new File("c:/users/pc/desktop/NovFolder/NovFile");
        try{
             file.createNewFile();
        }
        catch(IOException e){
            System.out.println(e);

        }
       

    }
    
}
