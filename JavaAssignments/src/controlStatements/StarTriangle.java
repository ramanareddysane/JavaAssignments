package controlStatements;

import java.util.Scanner;

class StarTriangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number");
		int n = sc.nextInt();

		for(int i=1; i<=n ; i++){
			int j = n;
			while(j-- >= i)
				System.out.print(" ");

			j = n-i;
			while(j++<n)
				System.out.print("* ");
			System.out.println();
		}
	}
}