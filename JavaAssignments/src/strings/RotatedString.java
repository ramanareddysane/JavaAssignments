package strings;
/*
*   There is another way of doing this problem. ie., with String inbuilt
* methods, (concatination and substring).
*   I just wanted to do it in this way... :P
*/

import java.util.Scanner;
class RotatedString {

	static boolean isRotatedString(String s1, String s2){

		int len1 = s1.length();	
		int len2 = s2.length();	
		
		//initial checkup
		if(len1 != len2)
			return false;

		//checking whether s2 is rotated string of s1 or not..
		int j = 0; 
		while (j<len2){
			/*    check if any character of is matched with first character of s1..
			    And return false if we  reach the end and (ie., if no character matches)*/
			while(s1.charAt(0)!=s2.charAt(j++))
				if(j == len2) 
					return false;

			int i = j; // check from the position after the matched character
			int index=1;//to track index of s1 till the end of it..
			while(index<len1)
				if(s1.charAt(index++) != s2.charAt(i++%len2))
					break;

			if(index == len1) // if entire string of s1 is matched by rotating s2 from i ;
				return true;

		} // end of while loop

		return false;

	}

	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(isRotatedString(str1, str2))
			System.out.println("They are rotated strings of one another..");
		else
			System.out.println("Nope...! They are not rotated strings of each other..");

	}


}