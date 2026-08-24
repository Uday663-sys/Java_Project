package IOT_5;
//SubString Example
 public class p4 {
    public static void main(String[] args) {
    	String  str= "ABC";
    	for (int i=0; i<str.length(); i++) {
    		String sub = "";
    		for (int j=i; j<str.length(); j++) {
    			sub=sub+str.charAt(j);
    			System.out.println(sub);
    		}
    	}
    }
}