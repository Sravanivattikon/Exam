package ReverseTable;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temporary;
		
		int values[] = {23, 45, 67, 49,92, 78, 69};
	
		int findSecondLargest(int[] arr) {
			int first=arr[0];
			int second =arr[0];
			for(int i=1;i<=arr.length;i++) {
				if(arr[i]>first) {
					second = first;
						first=arr[i];
				}else if(arr[i]>second && arr[i]!=first) {
					second=arr[i];
				}
					
				return second;
			}	
			int secondLargest = findSecondLargest(values);
			System.out.println("The second Largest Number from given array is : " + secondLargest);

	}

}
