package Array;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class MissingNumber {
public static void findMissingNumber(int arr[]) {
	int n=arr.length;
	int sum1=n;
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
		sum1+=i;
	}
	System.out.print("Missing Number : "+(sum1-sum));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {9,6,4,2,3,5,7,0,1};
findMissingNumber(arr);
	}
}
