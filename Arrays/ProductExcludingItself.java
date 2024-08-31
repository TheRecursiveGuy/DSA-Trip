package Array;
////Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.

//Brute force approach

public class ProductExcludingItself {
	public static int [] productexcludingItself1(int arr[]) {
		int n=arr.length;
		int result[]=new int[n];
		int index=0;
		while(index<n) {
			int product=1;
			for(int i=0;i<n;i++) {
				if(i==index) {
					continue;
				}
				product*=arr[i];
			}
			result[index]=product;
			index++;
		}
		
		return result;
	}
	//Better approach but extra space;
	public static int [] productexcludingItself2(int arr[]) {
		int n=arr.length;
		int left[]=new int[n];
		int right[]=new int[n];
		int result[]=new int[n];
		
		left[0]=1;
		for(int i=1;i<n;i++) {
			left[i]=arr[i-1]*left[i-1];
	}
		right[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			right[i]=arr[i+1]*right[i+1];
		}
		
		for(int i=0;i<n;i++) {
			result[i]=left[i]*right[i];
		}
		
		return result;
	}
	//Optimal approach O(n) TC and O(1) SC
	public static int [] productexcludingItself3(int arr[]) {
		int n=arr.length;
		int result[]=new int[n];
		
		result[0]=1;
		for(int i=1;i<n;i++) {
			result[i]=arr[i-1]*result[i-1];
		}
		
		int right=1;
		for(int i=n-1;i>=0;i--) {
			result[i]=result[i]*right;
			right*=arr[i];
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,4};
		int result[]=productexcludingItself1(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		int result1[]=productexcludingItself2(arr);
		for(int i=0;i<result1.length;i++) {
			System.out.print(result1[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		int result2[]=productexcludingItself3(arr);
		for(int i=0;i<result1.length;i++) {
			System.out.print(result1[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

}
