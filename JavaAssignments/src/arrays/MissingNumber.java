package arrays;

/*
 *
 * We are assuming that the array is unsorted..
 * array[1....10] instead of 1....100
 * 
*/

/* 
 * EXPLANATION:
 * we know that 0^val = val and val^val = 0
 *   Say 'x' be the missing value, what we are doing 
 * is "[xor of all array elements] ^ [1...10]".
 *  (5^3^.....^8)^(1^2^3^....^10) = missing number;
 * since (---1^1 = 0 and 0^val = val----)
*/
class MissingNumber{

	static int findMissingNumber(int[] array){
		int val = 0;
		for(int data:array)
			val^=data;

		for(int i=1; i<=10; ++i)
			val^=i;

		return val;
	}

	public static void main(String[] args){
		int[] array = {5,3,7,4,10,6,1,2,8};
		System.out.println(findMissingNumber(array));
	}
}