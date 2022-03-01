package week3.Thursday;

interface in1 {
    void display(int p);
}

public class testClass {

    int prime(int a) {
        int c = 0;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                c += 1;
                return c;
            }
        }
        return c;
    }

    void display(int p) {
        for (int i = 1; i < p; i++) {

        }
    }
}
