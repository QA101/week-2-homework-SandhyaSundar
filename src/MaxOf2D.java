
public class MaxOf2D {

	public static void main(String[] args) {
		int[][] numbers=new int[3][3];
		 numbers[0][0]= 4;
		 numbers[0][1]= 5;
		 numbers[0][2]= 6;
		 numbers[1][0]= 3;
		 numbers[1][1]= 8;
		 numbers[1][2]= 4;
		 numbers[2][0]= 2;
		 numbers[2][1]= 1;
		 numbers[2][2]= 3;
		   
		int rowIndex=0;
		int columnIndex=0;		  
			    int maxValue= numbers[0][0];
				for (int i=0;i<numbers.length;i++){
					for(int j=0;j<numbers[i].length;j++) {				
					  if (numbers[i][j]> maxValue) {
						maxValue=numbers[i][j];
			    		rowIndex=i;  
					    columnIndex=j;
					  }			
					  
				}
				}
				System.out.println("Index of the Maximum Value is: numbers [" + rowIndex+ "]"+"["+ columnIndex+ "]");
				System.out.println("Maximum Value="+maxValue);
	
}
}