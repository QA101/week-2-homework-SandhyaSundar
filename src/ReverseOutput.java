import java.util.Arrays;

public class ReverseOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] elements= {1,2,3,4,5,6};
		System.out.println("array of elements as:"+Arrays.toString(elements));	
		//    for(int i=0;i<elements.length;i++) {
		//        System.out.print(elements[i]+" ");
	    //  }
		    
		 //   System.out.println();
		int temp=0;
		int start=0;
		int end=elements.length-1;
		
		for (int j=0;j<= elements.length;j++) {
	//		System.out.println("in for loop");
	//		System.out.println("j:"+j);	
	//		System.out.println("start:"+start);	
	//		System.out.println("end:"+end);	
	//		System.out.println("temp:"+temp);	
			
			if(start <= end) {
			temp= elements[start];
			elements[start]= elements[end];
			elements[end]= temp;
	//		System.out.println("in if loop");
	//		System.out.println("j:"+j);	
	//		System.out.println("start:"+start);	
	//		System.out.println("end:"+end);	
	//		System.out.println("temp:"+temp);	
			}
			start=start+1;
			end=end-1;
		}
	System.out.println("Reverse array of elements as:"+Arrays.toString(elements));
						
			
		}
		
	
	}

	
	
		
	
		

