import java.util.Arrays;

public class PrintNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] elements= {-6,-7,0,1,2,3,4,5,6,-47,-8,9,-10,11,-12,13,14,-15,16,-17,-8,20,21,-101};
		
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		
		for(i=0;i<elements.length;i++) {
			if(elements[i] < 0) {
			//System.out.println("j"+j);
			j=j+1;
			}
		}
		int[] output=new int[j];
		
		for(k=0;k<elements.length;k++){
		   if(elements[k]<0) {
			   output[l]=elements[k];
			   l=l+1;
		   }
		 		   }
		System.out.println("output:"+Arrays.toString(output));
	}

}
