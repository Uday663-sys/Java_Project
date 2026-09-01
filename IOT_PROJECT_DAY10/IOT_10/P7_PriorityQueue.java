package IOT_10;
import java.util.*;
public class P7_PriorityQueue {
	public static void main(String[] args) {
		int[] numbers = {10,5,20,8,15,30,25};
		int WindowSize = 3;
		PriorityQueue <Integer>minHeap = new PriorityQueue<>(); 
		for ( int number : numbers) {
			minHeap.add(number);
			if( minHeap.size() > WindowSize) {
				minHeap.poll();
			}
		}
		System.out.println("Top " + WindowSize + " Largest Numbers:");
		
		while (!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}
}
