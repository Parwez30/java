package in.nit.workshop;

public class ArrayOperation {
	
	public static void main (String args[]) {
		//get the sum of array elements
		int numbers[] = {2,6,3,8,9};
		int nums[] = {1,2,3,4};
		int sum = 0;
		int square = 0;
		int cube = 0;
		
		for(int index = 0; index < numbers.length; index++) {
            sum = sum+numbers[index];
		}
		System.out.println("Sum of array elements:"+sum);
		
		
		for(int index = 0; index < nums.length; index++) { 
		    square = nums[index]*nums[index];
		    System.out.println("Square is:"+square); 
		}
	    
		for(int index = 0; index < nums.length; index++) { 
		    cube = nums[index]*nums[index]*nums[index];
		    System.out.println("Cube is:"+cube); 
		}
		
		for(int index = 0; index < numbers.length; index++) { 
		    if(numbers[index] %2 == 0) {
		    System.out.println("It is even"); 
		    }
		else
		{
			System.out.println("It is odd"); 	
		}
		}
		}

}
