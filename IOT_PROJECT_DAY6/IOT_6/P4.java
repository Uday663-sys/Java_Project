package IOT_6;
//fixed sliding window using alternate logic
 public class P4 {
    public static void main(String[] args) {
    	int[] arr = {10, 20, 30, 40, 50, 60};
        int windowSize = 3;
        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += arr[i];
        }
        System.out.println("Sum:" + sum);
        for (int i=windowSize; i<arr.length; i++) {
            sum = sum - arr[i-windowSize] + arr[i];
            System.out.println("Sum:" + sum);
        }
    }
}