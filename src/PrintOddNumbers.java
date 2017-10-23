import java.util.Arrays;

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] elements= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20,21};
		
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		
		for(i=0;i<elements.length;i++) {
			if(elements[i] % 2 !=0) {
			//System.out.println("j"+j);
			j=j+1;
			}
		}
		int[] output=new int[j];
		
		for(k=0;k<elements.length;k++){
		   if(elements[k]% 2 !=0) {
			   output[l]=elements[k];
			   l=l+1;
		   }
		 		   }
		System.out.println("output:"+Arrays.toString(output));
	}

}
