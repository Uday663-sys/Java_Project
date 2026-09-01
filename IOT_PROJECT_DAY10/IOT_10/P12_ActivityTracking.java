package IOT_10;
public class P12_ActivityTracking {
	public static void main(String[] args) {
		int[] arrival = {9, 9,10,10,11};
		int[] departure = {10,11,10,11,12};
		System.out.println("Selected Activities:");
		int lastEnd = departure[0];
		System.out.println(" Activity A ");
		for ( int i=1; i<arrival.length; i++) {
			if (arrival[i] >= lastEnd ) {
				System.out.println(" Activity " + (char) ('A'+i));
				lastEnd = departure[i];
			}
		}
	}
}