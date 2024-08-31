package Array;

public class Second_Largest {
	public static int findSecLargest(int arr[]) {
		int largest=arr[0];
		int second_largest=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>largest) {
				second_largest=largest;
				largest=i;
			}
			else if(i>second_largest && i<largest) {
				second_largest=i;
			}
		}
		return second_largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,7,3,4,6,9,10};
System.out.println("The second largest element in the array is : "+findSecLargest(arr));
	}

}
