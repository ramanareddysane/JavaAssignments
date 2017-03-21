package arrays;

class LargestSmallest {
	static int[] array = {9,5,3,7,0,6,4};

	static void findLargeAndSmall(){
		int largest, smallest;
		largest = smallest = 0;
		for(int d:array){
			largest  = (d >= largest)?d:largest;
			smallest = (d <= smallest)?d:smallest;
		}
		System.out.println("Largest:"+ largest);
		System.out.println("smallest"+ smallest);
	}

	public static void main(String[] args){
		findLargeAndSmall();
	}
}