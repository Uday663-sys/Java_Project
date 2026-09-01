package IOT_10;
// GREEDY ALGORITHM
public class P1 {
	public static void main(String[] args) {
		int[] start = {1,2,3,5,6};
		int[] end = {3,4,5,7,8};
		System.out.println("Selected Activites");
		int lastEnd = end[0];
		System.out.println(" Activity 1 ");
		for ( int i=1; i<start.length; i++) {
			if (start[i] >= lastEnd ) {
				System.out.println(" Activity " + (i+1));
				lastEnd = end[i];
			}
		}
	}
}
