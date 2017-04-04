/*
    Write a java program to check whether the string prefix matches the any one of the prefixes mentioned in the file prefix-urlfilter.txt?
	
	Note : The format of this file is one URL prefix per line.    
		Let File contents are 	
		http://
		https://
		ftp://
		file://
	Input1:  http://www.example.com/
	Output1: true
 */
package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringPrefixMatch {
    public static void main(String[] args) {
        System.out.println("Enter an url string..");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        sc.close();
        
        boolean is_matched = false;
        
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("prefix-urlfilter.txt")));
            String prefix;
            while((prefix = br.readLine()) != null)
                if(url.startsWith(prefix))
                    is_matched = true;
            
        } catch (FileNotFoundException ex) {
            System.err.println("file does'nt found..");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.err.println("error occured while reading the file..");
        } finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.err.println("error occured while closing the file...");
                ex.printStackTrace();
            }
        } //end of finally
        
        if(is_matched)
            System.out.println("true");
        else
            System.out.println("false");
        
    }
}
