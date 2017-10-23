
public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberList = new int[] {23,55,89,34,678,75,-23};
		
		int minIndex = getMin(numberList);
		System.out.println("Index of the Minimum Value is:"+minIndex);
		System.out.println("Minimum value is:"+numberList[minIndex]);
		
		}
		private static int getMin(int[] numberList) {
		// TODO Auto-generated method stub
			int minValue= numberList[0];
			int j=0;
			for (int i=0;i<numberList.length;i++){
				if (numberList[i]< minValue) {
					minValue=numberList[i];
				    j=i;
				}
			}
			
			return j;
	}
}		
			