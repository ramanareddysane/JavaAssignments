package controlStatements;

import java.util.Scanner;

class Factorial {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int f = sc.nextInt();
		
		double factorial = 1;
		while(f >= 2)
			factorial*=f--;
		
		System.out.println("The factorial is: "+factorial);
	}
}