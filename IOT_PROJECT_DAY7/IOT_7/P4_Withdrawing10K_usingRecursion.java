package IOT_7;
public class P4_Withdrawing10K_usingRecursion {
	static void withdraw(int amount) {
		if (amount == 0) {
	            System.out.println("Balance: ₹0");
	            System.out.println("Withdrawal Completed");
	            return;
	        }
		System.out.println("Balance: ₹" + amount);
		withdraw(amount - 2000);
		}
		public static void main(String[] args) {
	        withdraw(10000);
	    }
	}

