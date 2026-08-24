package IOT_5;
//RABIN_KARP EXAMPLE
public class P7_Rabin_karp {
	public static void main(String[] args) {
		String text = "I Love Java Program";
		String pattern = "Java";
		int position = search(text,pattern);
		if(position!=-1) {
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
			int patternHash = getHash(pattern);
			for(int i=0; i<=n-m; i++) {
				String part = text.substring(i,i+m);
				int partHash = getHash(part);
				if (patternHash == partHash) {
					if(part.equals(pattern)) {
						return i;
					}
				}
				
			}
			return -1;
		}
		static int getHash(String str) {
			int hash = 0;
			for ( int i=0; i<str.length(); i++) {
				hash = hash + str.charAt(i);
			}
			return hash;
		}
	}

