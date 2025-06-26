package addon;

import java.util.Scanner;

public class mainprgm2 {
	
		    public static boolean isPalindrome(String str) {


	        int l = 0;
	        int r = str.length() - 1;


	        while (l< r) {
	            if (str.charAt(l) != str.charAt(r)) {
	                return false; 
	            }
	            l++;
	            r--;
	        }
	        return true; 
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String a = s.nextLine();

	        if (isPalindrome(a)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        s.close();
	    }
	}
