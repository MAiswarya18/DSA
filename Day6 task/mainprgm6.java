package addon;

import java.util.Arrays;

public class mainprgm6 {
	int[] arr=new int[5];
	int rear;
	int front;
	public mainprgm6()
	{
		rear=-1;
		front=-1;
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("Queue spreadout");
		}
		else
		{
			arr[++rear]=num;
		}
	}
	public void dequeue()
	{
		if(front==4)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			arr[++front]=0;
		}
	}
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[])
	{
		mainprgm6 mp=new mainprgm6();
		mp.enqueue(33);
		mp.enqueue(44);
		mp.display();
		mp.dequeue();
		mp.display();
	}

}
