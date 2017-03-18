package controlStatements;

import java.util.Scanner;

public class SwapWOThirdVariable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values to swap");
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Before swaping: a="+a+" b="+b);
		b = (a + b) - (a = b);
		System.out.println("After swaping: a="+a+" b="+b);
	}

}
