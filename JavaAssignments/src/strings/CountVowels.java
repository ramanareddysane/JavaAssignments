package strings;

import java.util.Scanner;

class CountVowels{

	static char[] vowels ={'a','e','i','o','u'};

	static boolean isVowel(char c){
		for(char ch:vowels)
			if(ch == c)
				return true;
		return false;
	}

	public static void main(String[] args){
		int no_of_vowels = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter a String:");
		String string = sc.next();

		for(char ch:string.toCharArray())
		    if(isVowel(ch))
	            no_of_vowels++;
                            
		if(no_of_vowels == 0)
			System.out.println("No vowels at all");
		else
			System.out.println(no_of_vowels+" vowels ara present");
	}
        

}