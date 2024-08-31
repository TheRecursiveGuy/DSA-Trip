package Array;
import java.util.*;
public class LinearSearch {

	public static boolean search(int arr[],int a) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==a) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]= {1,7,3,4,6,9,10};
		System.out.print("Enter a number to be searched : ");
		int n=in.nextInt();
		System.out.println(search(arr,n));
	}
}
