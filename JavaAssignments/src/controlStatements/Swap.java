package controlStatements;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values to swap");
		
		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println("Before swaping: i="+i+" j="+j);
		int temp = i;
		i = j;
		j = temp;
		System.out.println("After swaping: i="+i+" j="+j);
		
	}

}
