package addon;

import java.util.Arrays;

public class mainprgm7 {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        System.out.println("Original array");
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println("\nSorted array:");
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}