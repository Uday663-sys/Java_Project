package IOT_3;
public class trycatchexample {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int[] a= {2,3,4};
			System.out.println(10/2);
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array exception");
		}
		catch(ArithmeticException e) {
			System.out.println(" arithmetic exception ");
		}
		catch(Exception e) {
			
			System.out.println("  exception ");
		}
		System.out.println("  HI ");
	}
}


