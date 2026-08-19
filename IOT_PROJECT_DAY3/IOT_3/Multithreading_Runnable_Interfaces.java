package IOT_3;
class Multithreading_Runnable_Interfaces implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {

    	Multithreading_Runnable_Interfaces obj = new Multithreading_Runnable_Interfaces();

        Thread t1 = new Thread(obj, "Thread 1");
        Thread t2 = new Thread(obj, "Thread 2");

        t1.start();
        t2.start();
    }
}
