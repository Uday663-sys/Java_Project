package IOT_10;
import java.util.PriorityQueue;
import java.util.Collections;
public class P11_Max_Min_Median {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 3, 25};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());        
        for (int num : arr) {
            minHeap.add(num);
            maxHeap.add(num);
        }
        System.out.println("Min Heap: " + minHeap);
        System.out.println("Smallest Value: " + minHeap.peek());
        System.out.println();
        System.out.println("Max Heap: " + maxHeap);
        System.out.println("Largest Value: " + maxHeap.peek());
        System.out.println();
        PriorityQueue<Integer> temp = new PriorityQueue<>(minHeap);
        int n = temp.size();
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = temp.poll();
        }
        if (n % 2 == 1) {
            System.out.println("Center Value: " + sorted[n / 2]);
        } else {
            System.out.println("Center Values: " + sorted[n / 2 - 1] + " and " + sorted[n / 2]);
        }
    }
}
