package addon;

public class Day3Task1 {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int val) 
		{
	        data = val;
	      
	    }
	}
	 
	public void insertData(int val) {
	   Node newNode = new Node(val);
       if (head == null) {
           head = newNode;
           newNode.next=null;
       }
       else
       {
    	   newNode.next=head;
    	   head=newNode;
       }
    }
	
	public void display()
	{
		Node temp=head;
		while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
	}
	
	public static void main(String args[])
	{
		Day3Task1 d1=new Day3Task1();
		d1.insertData(45);
		d1.insertData(56);
		d1.insertData(67);
		d1.display();
	}
}
