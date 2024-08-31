package Array;

public class LeftRotate {
	public static void leftRotate(int arr[]) {
		int n=arr.length;
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//To left rotate an array by one place
		int arr[]= {2,8,3,6,9,5};
		leftRotate(arr);
	}

}
