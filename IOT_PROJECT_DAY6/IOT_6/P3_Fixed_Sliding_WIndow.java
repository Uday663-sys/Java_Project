package IOT_6;
//FIXED SLIDING WINDOW 
public class P3_Fixed_Sliding_WIndow {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		int windowSize = 3;
		int sum = 0;
		for (int i=0; i<windowSize; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum:" + sum);
		int start = 0;
		for (int end = windowSize; end<num.length; end++) {
			sum = sum - num[start];
			sum = sum + num[end];
			start ++;
			System.out.println("Sum:" + sum);
		}
	}
}
