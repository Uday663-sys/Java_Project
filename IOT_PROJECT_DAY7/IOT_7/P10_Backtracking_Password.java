package IOT_7;
public class P10_Backtracking_Password {
	static String correctpassword="1234";
	static void trypassword(String password) {
		System.out.println("Trying:" + password);
		if (password.equals(correctpassword)) {
			System.out.println("Password Found:" + password);
			return ;
		}
		System.out.println(" Wrong Password.Go Back and Try Again:");
	}
	public static void main(String[] args) {
		trypassword("2345");
		trypassword("3456");
		trypassword("4567");
		trypassword("5678");
		trypassword("6789");
		trypassword("1234");
	}
}
