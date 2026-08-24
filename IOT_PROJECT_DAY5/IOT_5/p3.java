package IOT_5;
//Reference
//Content
public class p3 {
	public static void main(String[] args) {
		String u1="snpsu";
		String u2="snpsu";
		String u3=new String("snpsu");
		String u4=new String("snpsu");
		System.out.println("(u1==u2):"+ (u1==u2));
		System.out.println("(u1.equals(u2)):"+ (u1.equals(u2)));
		System.out.println();
		System.out.println("(u3==u1):"+ (u3==u1));
		System.out.println("(u3.equals(u4)):"+ (u3.equals(u1)));
		System.out.println();
		System.out.println("(u4==u2):"+ (u4==u2));
		System.out.println("(u4.equals(u2)):"+ (u4.equals(u2)));
		System.out.println();
		System.out.println("(u3==u4):"+ (u3==u4));
		System.out.println("(u3.equals(u4)):"+ (u3.equals(u4)));
	}
}
