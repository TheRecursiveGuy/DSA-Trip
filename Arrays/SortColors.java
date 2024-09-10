package Array;

public class SortColors {
public static void sortColors(int arr[]) {
	int n=arr.length;
	int mid=0;int low=0;int high=n-1;
	while(mid<=high) {
		if(arr[mid]==0) {
			int temp=arr[low];
			arr[low]=arr[mid];
			arr[mid]=temp;
			
			low++;
			mid++;
		}
		else if(arr[mid]==1) {
			mid++;
		}
		else if(arr[mid]==2) {
			int temp=arr[high];
			arr[high]=arr[mid];
			arr[mid]=temp;
			
			high--;
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,0,2,2,1,0,1};
		System.out.print("The original array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("The sorted color array is : ");
		sortColors(arr);
	}

}
