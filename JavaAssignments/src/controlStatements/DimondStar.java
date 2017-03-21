package controlStatements;

import java.util.Scanner;

class DimondStar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number");
		int n = sc.nextInt();

		int i, j;
		//prints upper triangle
		for(i=1;i<n;i++){
			j = n-i;
			while(j-- > 0)
				System.out.print("   ");
			j = 2*i -1;
			while(j-- > 0)
				System.out.print(" * ");
			System.out.println();
		}

		/*  prints common base for both upper
		 and lower triangles... */
		 i = 2*n;
		 while(i-- > 1)
		 	System.out.print(" * ");
		 System.out.println();

		 // prints lower triangle
		 for(i=n-1;i>0;i--){
			j = n-i;
			while(j-- > 0)
				System.out.print("   ");
			j = 2*i -1;
			while(j-- > 0)
				System.out.print(" * ");
			System.out.println();
		}

	}
}

/*

output:      * 
          *  *  * 
       *  *  *  *  * 
    *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  * 
       *  *  *  *  * 
          *  *  * 
             * 


*/