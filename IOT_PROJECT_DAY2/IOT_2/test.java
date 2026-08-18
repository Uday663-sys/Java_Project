package IOT_2;

public class test {
	int a=20;
	int b=10;
	void m1(int c,int d) {
		System.out.println("dgyug"+(a+b));
		System.out.println("dgyuggjvagj"+(c+d));
		System.out.println("dgyug"+(this.a+this.b));
	}
	public static void main(String[] args) {
		test vv=new test();
		vv.m1(5,6);
	}
}
