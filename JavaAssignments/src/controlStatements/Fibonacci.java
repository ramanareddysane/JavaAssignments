package controlStatements;

import java.util.Scanner;

class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number which is the limit for fibonacci series");
		int num = sc.nextInt();

		// pritning the fibonacci series
		int i = 0 ;
		int j = 1;
		System.out.print(i+", ");
		while(j <= num) {
			System.out.print(j+", ");
		 	j = (i + 2*j) - (i = j);/* It will move j into i, and 
		 	 (i+j) into j*/
		}
		System.out.println(".... ... .. .");
	}
}