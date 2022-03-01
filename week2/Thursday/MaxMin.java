package week2.Thursday;

public class MaxMin {
    static void calcMaxMin(int[] a) {
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
        }
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
    }

    public static void main(String[] args) {
        int[] arr = { 34, 43, 435, 5, 456, 65, 655, 255 };
        calcMaxMin(arr);
    }
}
