package strings;

import java.util.Scanner;
import java.util.HashSet;

class DuplicateCharactersInString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();

		StringBuilder sb = new StringBuilder();
		 HashSet hset = new HashSet();
		for(int i=0; i<str.length(); i++)
			if(hset.add(str.charAt(i)))
				sb.append(str.charAt(i));

		System.out.println(sb.toString());
	}

}