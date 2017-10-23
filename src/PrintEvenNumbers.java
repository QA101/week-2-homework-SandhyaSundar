import java.util.Arrays;

public class PrintEvenNumbers {

	public static void main(String[] args) {

		int[] elements= {1,2,3,4,5,6,7,8,9,10,11,12,15,18,20,22};
		
		int i=0;
		int j=0;
		int k=0;
		int l=0;

      // to find the total number of even numbers 
		for(i=0;i<elements.length;i++) {
			if(elements[i] % 2==0) {
			j=j+1;
			//System.out.println("j:"+j);
		}
		}
				
		//Defining the output array length using j
        int[] output=new int[j];
      		
        // Writing into output array
        for(k=0;k<elements.length;k++) {
			if(elements[k] % 2==0) {
				output[l]=elements[k];
				l=l+1;
			}
			}
   
		System.out.println("elements:"+Arrays.toString(elements));
	    System.out.println("output:"+Arrays.toString(output));
	}

}
