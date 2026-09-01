package IOT_10;
import java.util.PriorityQueue;
public class P10_Median {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(30);
        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(25);
        int n = heap.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = heap.poll();
        }
        if (n % 2 == 0) {
            System.out.println("Center Value : " +
                    arr[n / 2 - 1] + " and " + arr[n / 2]);
        } else {
            System.out.println("Center Value : " + arr[n / 2]);
        }
    }
}