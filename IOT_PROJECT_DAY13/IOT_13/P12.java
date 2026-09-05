package IOT_13;

public class P12 {

	public static void main(String[] args) {
		String str="ANAND";
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
					count ++;									
		}						
	}
		System.out.println("numbers of the vowels:"+count);		

	}
}