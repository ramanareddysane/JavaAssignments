/*
 * Java program to convert the characters of a file to uppercase  
 */
package files;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ToUpperCase {
    public static void main(String[] args) {
        File file;
        BufferedReader br = null;
        PrintWriter out = null;
        try{
           br = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")));
           StringBuilder sb = new StringBuilder();
           String s = "";
           while((s = br.readLine()) != null)
                sb.append(s);
           System.out.println("before converting...");
           System.out.println(sb.toString());
            
           out = new PrintWriter(new OutputStreamWriter(new FileOutputStream("sample.txt", false)));
           out.print(sb.toString().toUpperCase());
           
           System.out.println("After converting...");
            System.out.println(sb.toString().toUpperCase());
            
            file = new File("sample.txt");
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
             while((s = br.readLine()) != null)
                System.out.print(s);
           
        }catch(FileNotFoundException e){
            System.out.println("file does't found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            try {
                br.close();
                out.close();
            } catch (IOException ex) {
                System.out.println("Some error occured while closing the file...");
            }
        }
       
    }
}
