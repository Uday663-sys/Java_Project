package IOT_2;
public class test1 {
	int a;
	int b;
	void m1(int c,int d) {
		a=c;
		b=d;
	}
	void m2(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void m3() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		test1 ww=new test1();
		ww.m1(6,3);
		ww.m2(6,4);
		ww.m3();
	}
}
