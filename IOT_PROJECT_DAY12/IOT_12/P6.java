package IOT_12;

public class P6 {
	static int longestPalindromicSubsequence(String s) {
			int n = s.length();
          int[][] dp = new int[n][n];
           int i = 0;
		   dp[i][i] = 1;
            for (int length = 2; length <= n; length++) {
         for (int i1 = 0; i1 <= n - length; i1++) {
             int j = i1 + length - 1;
          if (s.charAt(i1) == s.charAt(j)) {
        	  if (length == 2) {
	                        dp[i1][j] = 2;
	                    } else {
	                        dp[i1][j] = dp[i1 + 1][j - 1] + 2;
	                    }

	                } else {

	                    dp[i1][j] = Math.max(
	                        dp[i1 + 1][j],
	                        dp[i1][j - 1]
	                    );
	                }
	            }
	        }

	        return dp[0][n - 1];
	    }

	    public static void main(String[] args) {
          String s = "BBABCBCAB";
              int result = longestPalindromicSubsequence(s);
              System.out.println("String: " + s);
	        System.out.println("Longest Palindromic Subsequence Length: " + result);
	    }
	}
