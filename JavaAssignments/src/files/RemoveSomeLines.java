/*
Write a java program to read a file named input.txt and store each line of a file as string in ArrayList ignore the lines which are started with # character and empty lines?
	Example: Let file input.txt contains the following contents: 
			aaaaa
			abababa
			#acdef
			cabef
			#a
		
	Output : ArrayList contains only the following data
			aaaaa
			abababa
			cabef
*/

package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RemoveSomeLines {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("input.txt")));
            ArrayList<String> list = new ArrayList<>();
            String s = "";
            
            while((s=br.readLine())!=null)
               if(s.charAt(0) != '#')
                    list.add(s);
            
            System.out.println("ArrayList contains only the following data");
            System.out.println(list);
           
        } catch (FileNotFoundException ex) {
            System.out.println("file does't found...");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error occured while reading the file..");
            ex.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error occured while closing the file");
            }
        }
        
    }
  
}
