package addon;

import java.util.Scanner;

public class PostAss3 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    public PostAss3() {
        head = null;
    }

    public void insertAtBegin(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PostAss3 list = new PostAss3();
        int choice;

        do {
            System.out.println("\n1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete from Beginning");
            System.out.println("4. Delete from End");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    list.insertAtBegin(val);
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    int valEnd = sc.nextInt();
                    list.insertAtEnd(valEnd);
                    break;
                case 3:
                    list.deleteAtBegin();
                    break;
                case 4:
                    list.deleteAtEnd();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}