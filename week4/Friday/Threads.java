package week4.Friday;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println("t1 terminating");
    }
}

class MyThread2 implements Runnable {
    public void run() {
        String[] str = { "India", "Russia", "Germany", "Ukraine", "Tokyo" };
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("t2 terminating");
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t = new MyThread2();
        Thread t2 = new Thread(t);
        t2.start();
        System.out.println("Main Thread Running");
        System.out.println("Nezuko");
        System.out.println("Kyoto");
        System.out.println("Baka");
        System.out.println("main Thread terminating");
    }
}