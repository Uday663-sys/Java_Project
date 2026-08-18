package IOT_2;
public class MethodOverloadingDemo {
	void m1() {
		System.out.println("fdyuf");
	}
	void m1(int a) {
		System.out.println("fdyufjhdgg");
	}
	public static void main(String[] args) {
		MethodOverloadingDemo test=new MethodOverloadingDemo();
		test.m1();
		test.m1(5);
	}
}
