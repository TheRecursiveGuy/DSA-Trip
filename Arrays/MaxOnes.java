package Array;
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxOnes {
public static int findMaxOnes(int arr[]) {
	int max=0;
	int cnt=0;
	int n=arr.length;
	
	for(int i=0;i<n;i++) {
		if(arr[i]==1) {
			cnt++;
			if(cnt>max)
			max=Math.max(cnt, max);
		}
		if(arr[i]!=1)
			cnt=0;
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2,3,1,1,1,4,3,2,6,1,1,1,5,1,1,1,1};
System.out.println("Max consequite ones are : "+findMaxOnes(arr));
    }
}
