package addon;

import java.util.Scanner;

public class Day9Task2 {

    public static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Target: ");
		int target=sc.nextInt();
        int index = upperBound(arr, target);
        System.out.println("Upper bound of " + target + " is at index: " + index);
    }
}