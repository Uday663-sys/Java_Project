package IOT_12;

public class P7 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int j = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
