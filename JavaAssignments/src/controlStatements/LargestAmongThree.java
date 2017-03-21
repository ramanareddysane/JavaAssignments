package controlStatements;

import java.util.Scanner;

class LargestAmongThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();

		int largest = 0, larger = 0;
		largest = ( (larger = (i>j)?i:j) > k )?larger:k;
		System.out.println( "largest among three numbers is :"+largest);
	}
}
