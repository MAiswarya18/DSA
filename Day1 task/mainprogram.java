package addon;


	import java.util.ArrayList;
import java.util.Scanner;

	public class mainprogram {

	    static Scanner sc = new Scanner(System.in);
	    static ArrayList<Integer> array = new ArrayList<>();

	    public static void main(String[] args) {
	        recursiveMenu();
	    }

	    static void recursiveMenu() {
	        System.out.println("\nMenu:");
	        System.out.println("1. Insert element");
	        System.out.println("2. Delete element");
	        System.out.println("3. Display array");
	        System.out.println("4. Search element");
	        System.out.println("5. Reverse array");
	        System.out.println("6. Exit");
	        System.out.print("Enter your choice: ");
	        
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                insertElement();
	                break;
	            case 2:
	                deleteElement();
	                break;
	            case 3:
	                displayArray();
	                break;
	            case 4:
	                searchElement();
	                break;
	            case 5:
	                reverseArray();
	                break;
	            case 6:
	                System.out.println("Exiting program.");
	                return;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }

	        recursiveMenu();
	    }

	    static void insertElement() {
	        System.out.print("Enter element to insert: ");
	        int element = sc.nextInt();
	        array.add(element);
	        System.out.println(element + " inserted.");
	    }

	    static void deleteElement() {
	        if (array.isEmpty()) {
	            System.out.println("Array is empty.");
	            return;
	        }
	        System.out.print("Enter element to delete: ");
	        int element = sc.nextInt();
	        if (array.remove((Integer) element)) {
	            System.out.println(element + " deleted.");
	        } else {
	            System.out.println(element + " not found in array.");
	        }
	    }

	    static void displayArray() {
	        if (array.isEmpty()) {
	            System.out.println("Array is empty.");
	        } else {
	            System.out.println("Array contents: " + array);
	        }
	    }

	    static void searchElement() {
	        System.out.print("Enter element to search: ");
	        int element = sc.nextInt();
	        int index = array.indexOf(element);
	        if (index != -1) {
	            System.out.println(element + " found at index " + index + ".");
	        } else {
	            System.out.println(element + " not found in array.");
	        }
	    }
	    

	    static void reverseArray() {
	        if (array.isEmpty()) {


}}
	}