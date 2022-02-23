import java.util.Scanner;
import java.util.Arrays;

public class MergeArrays {
    static int mergeArrays(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = size1 + size2;
        int[] arr3 = new int[size3];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else if (arr1[i] > arr2[j])
                arr3[k++] = arr2[j++];
            else {
                arr3[k++] = arr2[j++];
                i++;
                size3--;
            }
        }
        while (i < size1)
            arr3[k++] = arr1[i++];
        while (j < size2)
            arr3[k++] = arr2[j++];
        for (i = 0; i < size3; i++) {
            System.out.print(arr3[i] + " ");
        }

        return size3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int[] arr1 = new int[s1];
        int[] arr2 = new int[s2];

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < s1; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < s2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int l = mergeArrays(arr1, arr2);

        System.out.println("\nThe Union elements are : " + l);

        scanner.close();
    }
}
