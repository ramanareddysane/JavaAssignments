package controlStatements;

public class IsPrime {
	
	static void checkPrime(double p){
		/*  code to avoid unnecessary 
		  computation and incorrect result */
		if ( p < 2 ) {
			System.out.println("prime numbers usually starts with 2");
			return;
		} else if (p == 2){
			System.out.println("2 is an Even Prime NUmber");
			return;

		}
		
		// Normal Code to check whether it is prime or not.
		boolean divisor_exists = false;
		/* checking whether a divisor
		 * exits other than 1*/  
		int i = 1;
		double num = Math.ceil(Math.sqrt(p));
		while (!divisor_exists && ++i<=num)
			if(p%i == 0)
				divisor_exists = true;

		if(!divisor_exists)
			System.out.println(p+" is a prime number");
		else
			System.out.println(p+" is not a prime number");
	}
	
	public static void main(String[] args) {
		checkPrime(61);
	}

}
