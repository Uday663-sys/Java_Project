package IOT_2;
public class OverridingDemo {
	void minbal() {
		System.out.println("bhadg");
	}
	void minbal(int a) {
		System.out.println("fdyufvdjha");
	}
	public static void main(String[] args) {
		OverridingDemo test=new OverridingDemo();
		test.minbal();
		test.minbal(7);
	}
}
