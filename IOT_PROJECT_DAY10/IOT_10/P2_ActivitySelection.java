package IOT_10;
public class P2_ActivitySelection {
	public static void main(String[] args) {
		int[] start = {1,2,3,5,6};
		int[] end = {3,4,5,7,8};
		System.out.println("Doctor Appointment ");
		int lastEnd = end[0];
		System.out.println(" Best Appointment Approach A ");
		for ( int i=1; i<start.length; i++) {
			if (start[i] >= lastEnd ) {
				System.out.println(" Best Appointment Approach " + (char) ('A'+i));
				lastEnd = end[i];
			}
		}
	}
}
