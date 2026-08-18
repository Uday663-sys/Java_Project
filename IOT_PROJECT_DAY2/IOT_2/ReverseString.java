package IOT_2;
public class ReverseString {
	public static void main(String[] args) {
		String str="Uday";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse Of A String:"+reverse);
	}

}
