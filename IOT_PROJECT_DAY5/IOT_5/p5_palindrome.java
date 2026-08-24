package IOT_5;
public class p5_palindrome {
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
			if(str.equals(rev)) 
				System.out.println("Is A Palindrome");
            else
				System.out.println(" Not A Palindrome");
		
	}
}
