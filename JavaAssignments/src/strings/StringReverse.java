package strings;

import java.util.Scanner;

class StringReverse {

	static String reverse(String string){
		char[] ch = string.toCharArray();
		int l = 0; // left (first) index
		int r = string.length()-1; // right(last) index 
		char temp;

		while(l <= r){
			temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;r--;
		}

		return new String(ch);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = sc.next();

		System.out.println("Reversed string: "+reverse(string));

	}

}