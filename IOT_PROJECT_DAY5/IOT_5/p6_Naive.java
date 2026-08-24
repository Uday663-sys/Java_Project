package IOT_5;
// Naive PROGRAM EXAMPLE
public class p6_Naive {
	public static void main(String[] args) {
		String text = "Rakesh Hate Non-Veg Food";
		String pattern = "@SNPSU";
		int position = search(text,pattern);
		if(position !=-1) {
			System.out.println("PAttern Found At Index:"+ position);
		}
		else
		{
			System.out.println("PAttern  Not Found:");
		}
		}
		static int search(String text, String pattern) {
			int n = text.length();
			int m = pattern.length();
			for(int i=0; i<=n-m; i++) {
				int j;
				for (j=0; j<m; j++) {
					if(text.charAt(i+j) !=pattern.charAt(j)) {
						break;
					}
				}
				if(j == m) {
					return i;
				}
			}
			return -1;
		}
	}

