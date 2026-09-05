package IOT_13;
import java.util.Arrays;
public class P1 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 1, 2, 4, 3};

        Arrays.sort(arr);

        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("After removing duplicate numbers:");

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}