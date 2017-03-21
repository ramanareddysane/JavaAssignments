package controlStatements;

import java.util.Scanner;

class ReverseOfNumber {
	public static void main(String[] args){
		// take the number from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num = sc.nextInt();
		System.out.println("Your Original number :"+num);

		// Code to reverse the number
		int r_num = 0;
		while(num !=0){
			r_num = (r_num * 10) + (num % 10);
			num = num /10;
		}

		System.out.println("Reverse of the number is " + r_num);
	}
}