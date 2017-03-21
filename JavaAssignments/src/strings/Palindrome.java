
package strings;

import java.util.Scanner;

class Palindrome{

	static boolean isPalindrome(String string){
		char[] c = string.toCharArray();
		int left = 0;
		int right = c.length-1;

		while(left <= right )
			if(c[left++] != c[right--])
				return false;

		return true;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter a String:");
		String string = sc.next();

		if(isPalindrome(string))
			System.out.println("It is an Palindrome");
		else
			System.out.println("It's not a Palindrome");

	}
        

}