package Array;
import java.util.*;
public class KPlaceLeftRotate {
	public static void leftRotateK(int arr[],int k) {
		//to rotate an array by k places to the left
		int n=arr.length;
		int l=0;
		int r=n-1;
		
		reverse(arr,l,r);
		
		reverse(arr,l,n-k-1);
		
		reverse(arr,n-k,r);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] reverse(int arr[],int l,int r) {
		if(l>=r)
			return arr;
		else {
		int temp=0;
		temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		return reverse(arr,l+1,r-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7};
		System.out.print("Enter the value of k: ");
		int k=in.nextInt();
		System.out.println();
		leftRotateK(arr,k);
	}
}
