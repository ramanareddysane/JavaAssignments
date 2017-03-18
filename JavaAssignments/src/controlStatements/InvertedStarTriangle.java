package controlStatements;

import java.util.Scanner;

class InvertedStarTriangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number");
		int n = sc.nextInt();

		for(int i=1; i<=n ; i++){
			int j = i-1;
			while(j-- > 0)
				System.out.print("   ");

			j = 2*(n-i) + 1;
			while(j-- > 0)
				System.out.print(" * ");
			System.out.println();
		}
	}
}