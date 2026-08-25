package IOT_6;
//Two Pointers in Array 
public class P1 {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,7};
		int target = 9;
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				System.out.println("Found At: " + arr[left]  + " and " +  arr[right] );
				break;
			}
			else if (sum<target) {
				left ++;
			}
			else {
				right--;
			}
		}
	}
}
