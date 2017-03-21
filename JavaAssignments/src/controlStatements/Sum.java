package controlStatements;


import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add");
		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println("Sum of these two integers is:"+ (i+j)); 
	}

}
