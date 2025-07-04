package addon;

public class Day5Task2 {
	

	Node last;

	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
			next=null;	
		}
		}
	public Day5Task2() {
		last=null;
	}
	public void insert(int val) {
		  Node newNode = new Node(val);
	      if (last == null) {
	          last = newNode;
	          last.next = last;
	      } else {
	          newNode.next = last.next;
	          last.next = newNode;
	      }
	}
	 public void display() {
	        if (last == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        Node temp = last.next;
	        while (true) {
	            System.out.print(temp.data + "->");
	            temp = temp.next;
	            if (temp == last.next) {
	                break;
	            }
	        }
	        System.out.println(last.next.data);
	    }

	public static void main(String[] args) {
		Day5Task2 c=new Day5Task2();
		c.insert(45);
		c.insert(2);
		c.insert(34);
		c.insert(26);
		c.insert(20);
		c.display();
	}

	}



