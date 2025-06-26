package addon;

import java.util.Arrays;
import java.util.Scanner;

public class Day8Task2 {
    public static void main(String args[]) {
        int a[] = {23, 45, 66, 4, 3, 77};
        Scanner sc = new Scanner(System.in);

        System.out.println("Original Array: " + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("Sorted Array: " + Arrays.toString(a));

        System.out.println("Enter number to find:");
        int find = sc.nextInt();

        int result = BinarySearch(a, 0, a.length - 1, find);

        if (result == -1) {
            System.out.println("Number " + find + " not found in the array.");
        } else {
            System.out.println("Number " + find + " found at index: " + result);
        }

        sc.close(); 
    }

    public static int BinarySearch(int[] a, int left, int right, int find) {
        
        if (left > right) {
            return -1; 
        }

        int mid = left + (right - left) / 2;

        if (a[mid] == find) {
            return mid; 
        } else if (find > a[mid]) {
            
            return BinarySearch(a, mid + 1, right, find);
        } else {
            
            return BinarySearch(a, left, mid - 1, find);
        }
    }
}