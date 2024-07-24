package week1.day4;

import java.util.Arrays;

public class learnArrays {

	public static void main(String[] args) {
		// Declare Array by literal
		// instead of declaring int 5 and 7 separately , we are storing in array in a single variable
		int arr[]= {5,7};

		
		// Declare array by instantiation (creating object)
		int[] numbers=new int[5];  //0,1,2,3,4
		
		numbers[0]=70;
		numbers[1]=80;
		numbers[2]=90;
		numbers[3]=100;
		numbers[4]=110;
		
		System.out.println(numbers[0]);
		
		//sample scores
		int scores[]= {30,20,10,40,15};
		
		//To find length of array
		//To get the return type of the method
				//scores.length=scores.length;
				System.out.println("The length is:"+" "+numbers);
				
				//To retrieve particular value 100
				System.out.println("The value in index 2 is "+scores[2]);
				
				// To sort array
				
				Arrays.sort(scores);
				
				//To get the least value
				System.out.println("After sorting the lease value: "+scores[0]);
				
				// to print largest value
				System.out.println("Largest value"+ scores[scores.length-1]);
				
				
				//to retrieve all values
				//0 1 2 3 4
				for (int i=0;i<scores.length;i++) {
					System.out.println("The array values are:"+scores[i]);
				}
				
	}

}
