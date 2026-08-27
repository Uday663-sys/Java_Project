package IOT_7;
//TAIL RECURSION
public class P3 {
	static void count(int n) {
		if (n == 0) {
			return ;
		}
		System.out.println(n);
		count(n - 1);
	}
	public static void main(String[] args) {
		System.out.println("Hmm");
		count(5);
		System.out.println("ABCD");
	}
}

