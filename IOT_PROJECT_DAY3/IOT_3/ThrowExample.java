package IOT_3;
import java.util.Scanner;
public class ThrowExample {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible for Voting");
		}
			else {
				System.out.println("Eligible To Vote");
		}
				
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age");
			int n=sc.nextInt();
			validate(n);
			System.out.println("Hmm");
		
		}
}
		


