package IOT_3;
import java.util.Iterator;
class Resourse {
	synchronized void method1(Resourse r) {
		System.out.println(Thread.currentThread().getName()+"Entered Method()");
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"Entered Method()");
		r.method2();
	}
	synchronized void method2() {
		System.out.println(Thread.currentThread().getName()+"Entered Method2()");
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class DeadLock {
	public static void main(String[] args) {
		Resourse r1 = new Resourse();
		Resourse r2 = new Resourse();
		Thread t1 = new Thread(()->{
			r1.method1(r2);
		},"Thread 1");
		Thread t2 = new Thread(()->{
			r2.method1(r1);
		},"Thread 2");
		t1.start();
		t2.start();
	}
}
