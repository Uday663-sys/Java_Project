package IOT_7;
public class P9_Backtracking {
	static void count(int n) {
		if (n > 5) {
	            return;
	    }
		System.out.println("Forward: " + n);
		count(n + 1);
		System.out.println("Backtrack: " + n);
	  }
		public static void main(String[] args) {
			count(1);
	   }
 }

