package IOT_10;
import java.util.PriorityQueue;
public class P8_MinHeapSmall {
	public static void main(String[] args) {
		PriorityQueue <Integer>minHeap = new PriorityQueue<>(); 
		minHeap.add(30);
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(5);
		System.out.println("Min Heap: " + minHeap);
		System.out.println("Smallest Numbers: " + minHeap.peek());
	}
}
