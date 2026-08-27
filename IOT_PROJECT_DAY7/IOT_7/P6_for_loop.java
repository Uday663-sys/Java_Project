package IOT_7;
public class P6_for_loop {
	public static void main(String[] args) {
		for (int amount = 10000; amount >= 0; amount -= 2000) {
	            System.out.println("Balance: ₹" + amount);
	        }
		System.out.println("Withdrawal Completed");
	}
}

