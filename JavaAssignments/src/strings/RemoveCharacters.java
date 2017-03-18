package strings;

import java.util.Scanner;
class RemoveCharacters {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter String1 and String2");

        
        String s1=sc.next();
        String s2=sc.next();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=s1.length()-1;i++)
            if(s2.indexOf(s1.charAt(i)) == -1)
                sb.append(s1.charAt(i));

        
        System.out.println("final s1 is:" + sb.toString());
    }
}