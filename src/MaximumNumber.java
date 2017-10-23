public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] numberList = new int[] {23,55,89,34,678,75,-23};
	int maxIndex = getMax(numberList);
	System.out.println("Index of the Maximum Value is:"+ maxIndex );
	System.out.println("Maximum value is:"+ numberList[maxIndex]);
	
	}
	private static int getMax(int[] numberList) {
		// TODO Auto-generated method stub
		int maxValue= numberList[0];
		int j=0;
		for (int i=0;i<numberList.length;i++){
			if (numberList[i]> maxValue) {
				maxValue=numberList[i];
				j=i;
			}
		}
		
		return j;
	}
		
	     
	}


