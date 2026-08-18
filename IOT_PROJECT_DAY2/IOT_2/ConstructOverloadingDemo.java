package IOT_2;
public class ConstructOverloadingDemo {
	public ConstructOverloadingDemo() {
		System.out.println("Wats Up");
	}
	public ConstructOverloadingDemo(int a) {
		System.out.println("Hmm");
	}
	public static void main(String[] args) {
		ConstructOverloadingDemo ab=new ConstructOverloadingDemo();
		ConstructOverloadingDemo ac=new ConstructOverloadingDemo(4);
	}
}
