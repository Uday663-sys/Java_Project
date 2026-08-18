package IOT_2;
interface mac {
	abstract void depo();
}
interface mac1 {
	abstract void min();
}
public class Interface_1 implements mac, mac1 {
	public void depo() {
		System.out.println("Dude");
	}
	public void min() {
		System.out.println("dragon");
	}
	public static void main(String[] args) {
		Interface_1 v = new Interface_1();
		v.min();
		v.depo();
	}
}
