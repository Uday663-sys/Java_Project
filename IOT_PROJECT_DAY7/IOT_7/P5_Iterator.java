package IOT_7;
import java.util.ArrayList;
import java.util.Iterator;
public class P5_Iterator {
	public static void main(String[] args) {
		ArrayList<Integer> balance = new ArrayList<>();
		for (int amount = 10000; amount >= 0; amount -= 2000) {
	            balance.add(amount);
	        }
		Iterator<Integer> it = balance.iterator();

	        while (it.hasNext()) {
	            System.out.println("Balance: ₹" + it.next());
	        }
	        System.out.println("Withdrawal Completed");
	}
}
