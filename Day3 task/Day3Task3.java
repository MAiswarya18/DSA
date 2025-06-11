package addon;

public class Day3Task3 {
	Node head;
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
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
	public void deleteAtPosition(int delpos) {
    	Node temp=head;
    	Node dtemp=null;
    	for(int i=0;i<delpos-1;i++)
    	{
    		dtemp=temp;
    		temp=temp.next;
    	}
    	dtemp.next=temp.next;
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
		Day3Task3 d1=new Day3Task3();
		d1.insertData(34);
		d1.insertData(99);
		d1.insertData(77);
		d1.insertData(67);
		d1.insertData(45);
		d1.deleteAtPosition(4);
		d1.display();
	}

}
