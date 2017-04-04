
package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveComments {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("sample.java")));
            int val = -1;
            String s = null;
            while((s=br.readLine()) != null){
               // it deals with multiline comments
               if(s.trim().startsWith("/*")){
                   while((s=br.readLine()) != null)
                       if(s.trim().endsWith("*/"))
                           break;
               }else if(s.trim().startsWith("//")) //for single line comments
                   continue;
               else if ((val = s.indexOf("//"))!=-1){
                   // comment starts from middle..
                   System.out.println(s.substring(0, val));
               }
               else{
                   System.out.println(s);
               }
            } // end of while loop..
        } catch (FileNotFoundException ex) {
            System.err.println("file does'nt found");
        } catch (IOException ex) {
            System.err.println("error occured while reading file..");
        } finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.err.println("error occurred while closing the file");
            }
        }
    }
}
