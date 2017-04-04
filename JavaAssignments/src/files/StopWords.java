package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class StopWords {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("stopwords.txt")));
            StringBuilder sb = new StringBuilder();
            String s = "";
            while((s=br.readLine())!=null)
                sb.append(s);
            // store all words in hashset
            HashSet<String> hset = new HashSet<>();
            for(String word:sb.toString().split(","))
                hset.add(word);
            
            // read the input and don't print the stop words..
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text string");
            String text = sc.nextLine().toLowerCase();
            String[] words = text.split("\\s");
            for(String word:words)
                if(!hset.contains(word))
                    System.out.print(word+" ");
            System.out.println();
            
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file not found in default directoru...");
        } catch (IOException ex) {
            System.out.println("Error Occured while reading file...");
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error occured while closing file..");
            }
        }
    }
}
