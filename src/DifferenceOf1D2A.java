import java.util.Arrays;

public class DifferenceOf1D2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] a= {1,2,3,4};
	int[] b= {10,20,30,40};
	int[] c=new int[4];
	 
	for(int i=0;i<a.length;i++) {
		c[i]=a[i]-b[i];
		
	}
	System.out.println("Input[] c:"+Arrays.toString(c));
		
	}

}
