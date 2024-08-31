package Array;
//Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.
public class LongestSubarrayPositives {
public static int longestSubarray(int arr[],int k) {
	int max_len=0;
	int n=arr.length;
	int left=0;int right=0;
	int sum=arr[0];
	
	while(right<n) {
		while(sum>k && left<=right) {
			sum-=arr[left];
			left++;
		}
		
		if(sum==k) {
			max_len=Math.max(max_len, right-left+1);
		}
		
			right++;
			if(right<n)
			sum+=arr[right];
	}
	return max_len;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={10,5,2,7,1,9};
int k=15;
System.out.println(longestSubarray(arr,k));
	}
}
