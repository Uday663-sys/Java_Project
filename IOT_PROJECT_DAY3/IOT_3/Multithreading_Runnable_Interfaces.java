package IOT_3;
import java.util.Iterator;
class MyTasK implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" Child Thread"+i);
        }
    }
}
	public class Multithreading_Runnable_Interfaces{

    public static void main(String[] args) {

    	MyTasK task = new MyTasK();
    	Thread t=new Thread(task);
    	t.start();
    	for (int i = 1; i <= 5; i++) {
    		System.out.println("Main Method"+i);
    	}
        
    }
}

