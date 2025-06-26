package addon;

public class Day6Task1 {
	int mystack[]=new int[5];
	int top=-1;
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("Stack overflow");
		}
		else
		{
		mystack[++top]=num;
		}
	}
	public void pop()
	{
		if(top<0)
		{
			System.out.println("underflow");
		}
		else
		{
			System.out.println(mystack[top]+" popped out");
			--top;
		}
	}
	public void display()
	{
		for(int i=0;i<mystack.length;i++)
		{
			System.out.println(mystack[i]+" ");
			
		}
	}
	
public static void main(String args[])
{
	Day6Task1 d1=new Day6Task1();
	d1.push(34);
	d1.push(45);
	d1.push(78);
	d1.display();
	d1.pop();
	d1.display();
	
}

}
