package controlStatements;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int i = in.nextInt();
		if(i%2 == 0)
			System.out.println(i+" is an even number");
		else
			System.out.println(i+" is an odd number");
		
	}

}
