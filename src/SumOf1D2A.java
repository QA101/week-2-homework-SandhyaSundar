import java.util.Arrays;

public class SumOf1D2A {

	public static void main(String[] args) {
	
		int[] a= {1,2,3,4};
		int[] b= {10,20,30,40};
		int[] c=new int[4];
	//Error handling
		if (a.length != b.length) {
			System.out.println("Lenght of arrays are different");
		
		}
		else {
		for(int i=0;i<a.length;i++) {
			c[i]=a[i]+b[i];
    // System.out.println("in iteration:"+i);
	//System.out.println("a[i]="+a[i]);
	//System.out.println("b[i]="+b[i]);
	//System.out.println("c[i]="+c[i]);
	
	
		}
		}
	System.out.println("Input[] c:"+ Arrays.toString(c));
		   
		
	}
}

