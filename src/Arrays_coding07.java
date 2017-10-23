import java.util.*;

public class Arrays_coding07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
    Scanner console= new Scanner(System.in);
        System.out.print("No of index:" );
           int index= console.nextInt();
           double[] data =new double[index];
           
           double sum=0.0;
           for(int i=0;i<index;i++) {
        	   System.out.print("data ["+i+"]" + "=");
        	   data[i]=console.nextDouble();
        	   sum+= data[i];
             }
           double average= (double) sum /index;
           System.out.println("Average=" + average);
       
	}

}
