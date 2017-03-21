package controlStatements;

import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number");
		int num = sc.nextInt();

		// find how many digits in the given number.. 
		int digits = (Integer.toString(num)).length();
		int sum = 0, temp = num;

		//check whether it is armstrong number or not..
		while(temp != 0){
			sum += Math.pow(temp%10, digits);
			temp /= 10;
		}

		if(sum == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");

	}
}
