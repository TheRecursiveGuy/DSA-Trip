package Array;
import java.util.*;
public class RemoveSortedDuplicate {
	public static int removeDuplicate(int arr[]) {
		//This function uses an extra data structure to store the unique elements
		int n=arr.length;
		ArrayList<Integer> temp=new ArrayList<Integer>();
		temp.add(arr[0]);
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[i-1]) {
				temp.add(arr[i]);
			}
			else if(arr[i]==arr[i-1]) {
				continue;
			}
		}
		for(int i=0;i<temp.size();i++) {
			System.out.print(temp.get(i)+" ");
		}
		System.out.println();
		return temp.size();
	}
	public static int [] removeDupli(int arr[]) {
		int unique_index=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				arr[unique_index]=arr[i];
				unique_index++;
			}
			else
				continue;
		}
			return arr;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] a= {1,1,2};
   System.out.println(removeDuplicate(a));
   int result[]=removeDupli(a);
   for(int i=0;i<result.length;i++) {
	   System.out.print(result[i]+" ");
   }
	}
}
