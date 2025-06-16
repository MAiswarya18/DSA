package addon;

import java.util.Arrays;
import java.util.Scanner;

public class Day7Task1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length:");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			 a[i]=sc.nextInt();
		}
		findbubble(a);
	    sc.close();
		
	}
	
	public static void findbubble(int []a)
	{
		System.out.println(Arrays.toString(a));	
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
}
