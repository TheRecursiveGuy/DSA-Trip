package Array;

public class MoveZeroes {
	public static void moveZeroesToEnd(int arr[]) {
		int n=arr.length;
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index<n) {
			arr[index++]=0;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,5,0,2,4,0};
		moveZeroesToEnd(arr);
		
		int arr1[]= {0,0,1};
		moveZeroesToEnd(arr1);
	}
}
