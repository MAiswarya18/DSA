package addon;

import addon.post.Node;

public class Day5Task1 {
	Node last;
	class Node
	{
		int data;
		Node next;
		
	Node(int val)
	{
		data=val;
		next=null;
	}
	}
	public Day5Task1()
	{
		last=null;
	}
	
	public void insertValue(int val)
	{
		Node newnode=new Node(val);
		if(last==null)
		{
			last=newnode;
			newnode.next=last;
		}
		else
		{
			newnode.next=last.next;
			last.next=newnode;
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
	
	public static void main(String args[]) {
		Day5Task1 d5=new Day5Task1();
		d5.insertValue(45);
		d5.insertValue(55);
		d5.insertValue(56);
		d5.display();
	}

}
