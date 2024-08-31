package Array;
import java.util.*;
public class DuplicateElements {
	public static void duplicate(int arr[],ArrayList<Integer>a) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
				if(!a.contains(arr[i])) {
					a.add(arr[i]);
				}
			}
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[]= {1,2,3,4,4,4,1,5};
		ArrayList<Integer>a=new ArrayList<Integer>();
		duplicate(arr,a);
	}
}
