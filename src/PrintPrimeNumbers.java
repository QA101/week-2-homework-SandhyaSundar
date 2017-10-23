import java.util.Arrays;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		//declare the array elements with int datatype and assign the 1st 25 numbers.
		
		int[] elements= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
	
		//construct the array with name outputArray with int data type of length 9.
		int[] outputArray=new int[9];
		
		// defining the outputIndex variable and initialize with value 0.
		int outputIndex=0;
		
		// defining the variable index and initializing with value 0.
		// scope of the variable defined and initialized outside the loop will be used throughout the program.
		int index=0;
		
		//creating the for loop to read  elements array by incrementing the index by checking condition index is less than array length 
		for(index=0;index<elements.length;index++) {
		//debug:	System.out.println("in the iteration:"+index);
		
		boolean isPrime = true;
		if (elements[index]==1) {
				isPrime = false;
		}
		else if (elements[index]==2) {
			isPrime = true;
		 }
		else if (elements[index]%2==0) {
		   isPrime = false;
		}	

		else {
			for (int i=3;i*i<=elements[index];i+=2) {
				if (elements[index]%i==0) {
					isPrime = false;
				}
		}
		}
			if (isPrime) {
				outputArray[outputIndex]=elements[index];
				outputIndex=outputIndex+1;			
				}
		}
		System.out.println("Prime numbers in the given array are:");
		System.out.println(Arrays.toString(outputArray));
	}
}

		
		
	

