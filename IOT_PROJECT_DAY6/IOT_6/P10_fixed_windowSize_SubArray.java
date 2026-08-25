package IOT_6;
// FIXED SLIDING WINDOWSIZE OF 3 , FINDING THE SUBARRAY OF MAXIMUM INDEX VALUES
 public class P10_fixed_windowSize_SubArray {
    public static void main(String[] args) {
    	int[] arr = {4, 2, 7, 1,9};
        int windowSize = 3;
        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        int start = 0;
        for (int i = windowSize; i < arr.length; i++) {
            sum = sum - arr[i - windowSize] + arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                start = i - windowSize + 1;
            }
        }
        System.out.println("Maximum Sum:" + maxSum);
        System.out.print("SubArray Are:");
        for (int i = start; i < start + windowSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
