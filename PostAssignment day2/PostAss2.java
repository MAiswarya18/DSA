package addon;

public class PostAss2 {
	
	    public static void main(String[] args) {
	        int[] pointers = {4, 5, 2, 6, 9, 10};
	        int target = 8;

	        boolean found = false;

	            for (int i = 0; i < pointers.length; i++) {
	            for (int j = i + 1; j < pointers.length; j++) {
	                int a = pointers[i];
	                int b = pointers[j];

	                if (a + b == target) {
	                    System.out.println("Match found (sum): " + a + " + " + b + " = " + target);
	                    found = true;
	                }
	            }
	        }

	        if (!found) {
	            System.out.println("No match found: " + target);
	        }
	    }
	}
