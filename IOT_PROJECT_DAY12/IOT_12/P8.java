package IOT_12;

public class P8 {
	static void search(String text, String pattern) {
            int n = text.length();
	        int m = pattern.length();
	          int pHash = 0;
	        int tHash = 0;
        for (int i = 0; i < m; i++) {
	            pHash += pattern.charAt(i);
	            tHash += text.charAt(i);
        }
        for (int i = 0; i <= n - m; i++) {
             if (pHash == tHash) {
                int j;
        for (j = 0; j < m; j++) {
	          if (text.charAt(i + j) != pattern.charAt(j))
	                break;
	                }

	                if (j == m)
	                    System.out.println("Pattern found at index " + i);
	            }
             if (i < n - m) {
	                tHash = tHash - text.charAt(i) + text.charAt(i + m);
	            }
	        }
	    }

	    public static void main(String[] args) {

	        String text = "ABABCABAB";
	        String pattern = "ABAB";

	        search(text, pattern);
	    }
	}
