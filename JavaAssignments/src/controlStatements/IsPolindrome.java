package controlStatements;

import java.util.Scanner;

class IsPolindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some numbers");
		double num = sc.nextDouble();

		//check whether it is a polindrome or not
		double reverse_num = num;
		while(reverse_num != 0){
			reverse_num = num%10;
			num /= 10;
		}
		if(reverse_num == num)
			System.out.println("It is a polindrome");
		else
			System.out.println("It is not a polindrome");
	}

}