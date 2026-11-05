package IO;
// import  java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) {
    try{
        java.io.FileInputStream fis = new java.io.FileInputStream("c:/users/pc/desktop/octpractice/param.txt");
        int i = 0;
        while(( i = fis.read())!= -1){
            System.out.print((char)i);

        }

    }
    catch( IOException e ){
        System.out.println(e);


    }}
    
}
