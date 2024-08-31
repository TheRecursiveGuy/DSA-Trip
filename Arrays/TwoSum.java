package Array;
import java.util.*;

//This is the optimal approach for finding the indexes
public class TwoSum {
public  static void twoSum(int arr[],int target) {
	int[]result=new int[2];
	HashMap<Integer,Integer> map=new HashMap<>();
	int n=arr.length;
	int other=0;
	for(int i=0;i<n;i++) {
		other=target-arr[i];
		if(map.containsKey(other)) {
			result[0]=map.get(other);
			result[1]=i;
		}
		if(!map.containsKey(target))
			map.put(arr[i],i);
	}
	
	for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,5,3,11};
		int target=14;
		twoSum(arr,target);
	}

}
