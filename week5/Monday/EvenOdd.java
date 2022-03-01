package week5.Monday;

import java.util.Scanner;

class Printing {
    static int limit = 50;

    Printing() {
    }

    synchronized public void Even() {
        System.out.println("The Even numbers are");
        for (int i = 2; i < limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        try {
            wait();
        } catch (Exception e) {
        }
    }

    synchronized public void Odd() {
        System.out.println("The Odd numbers are");
        for (int i = 1; i < limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        notifyAll();
    }
}

class EvenOdd {
    public static void main(String[] args) {

        Printing obj = new Printing();
        Thread t1 = new Thread() {

            @Override
            public void run() {
                obj.Even();
            }
        };

        Thread t2 = new Thread() {

            @Override
            public void run() {
                obj.Odd();
            }
        };

        long startTime = System.nanoTime();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

    }

}
