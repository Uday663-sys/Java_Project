package IOT_3;
import java.util.Iterator;
public class MultithreadedExample extends Thread{
	public void run() {
		for (int i=0; i<=5; i++) {
			System.out.println("Method"+i);
		}
	}
		public static void main(String[] args) {
			MultithreadedExample bb=new MultithreadedExample();
			bb.start();
			for (int i=0; i<=5; i++) {
				System.out.println(" Main Method"+i);
			}
		}
		
	}
