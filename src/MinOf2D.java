
public class MinOf2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	int minValue=numbers[0][0];
	  for(int i=0;i< numbers.length;i++) {
		  for (int j=0;j<numbers[i].length;j++) {
			if (numbers[i][j]< minValue) {
				minValue=numbers[i][j];
				rowIndex=i;
				columnIndex=j;
			}
		}
	}
	
	  System.out.println("Index of minimum Value: numbers [" + rowIndex + "]"+"["+ columnIndex+ "]");
	  System.out.println("Maximum Value="+minValue);
	}

}
