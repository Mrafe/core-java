package week2.Thursday;

public class Merge {
    public static void mergeArrays(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] arr3 = new int[size1 + size2];
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else if (arr1[i] > arr2[j])
                arr3[k++] = arr2[j++];
            else {
                arr3[k++] = arr2[j++];
                i++;
            }
        }
        while (i < size1)
            arr3[k++] = arr1[i++];
        while (j < size2)
            arr3[k++] = arr2[j++];
        for (int arr : arr3)
            System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 6, 7, 8 };
        int[] b = { 1, 4, 5, 9, 11 };
        mergeArrays(a, b);
    }
}
