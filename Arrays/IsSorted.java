package Array;

public class IsSorted {
	public static boolean isSorted(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		if(isSorted(arr))
			System.out.println("The array is sorted !");
		else
			System.out.println("The array is not sorted !");
		System.out.println();
		int arr1[]= {1,2,1,4,5,3};
		if(isSorted(arr1))
			System.out.println("The array is sorted !");
		else
			System.out.println("The array is not sorted !");
	}

}
