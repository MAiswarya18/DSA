package addon;

import java.util.Scanner;

public class Day2Task3 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        	return 0;

        int i = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; 
            }
        }

        return i + 1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements :");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int newLength = removeDuplicates(nums);

        System.out.println("Duplicates removed:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }
}

	
		    