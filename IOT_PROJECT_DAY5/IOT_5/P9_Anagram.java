package IOT_5;
// Anagram Example
public class P9_Anagram {
	public static void main(String[] args) {
		String u1 = "listen";
		String u2 = "silent";
		int count = 0;
		for (int i=0; i<u1.length(); i++) {
			for (int j=0; j<u2.length(); j++) {
				if(u1.charAt(i) == u2.charAt(j)) {
					count ++;
					break;
				}
			}
		}
		if(count == u2.length()) 
			System.out.println("Anagram");
		else
			System.out.println(" Not a Anagram");
	}
}
