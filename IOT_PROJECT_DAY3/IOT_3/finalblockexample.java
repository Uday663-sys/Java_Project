package IOT_3;
public class finalblockexample {
	public static void main(String[] args) {
		 try {
			 System.out.println("Uday");
			 System.out.println(10/0);
			 }
		 catch(NullPointerException ne) {
			 System.out.println("exception"+ne);
		 }
		 finally {
			 System.out.println("final block  is always created");
		 }
		 System.out.println("gsafaf");
	}

}


