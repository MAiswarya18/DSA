package addon;

import java.util.Arrays;
import java.util.Scanner;

public class Day8Task1 {
	public static void main(String args[])
	{
		int a[]= {23,67,4,2,55,88,34};
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the number to find:");
		int find=sc.nextInt();
		boolean flag = true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find)
			{
				System.out.println("Value found "+a[i]+"at index "+i);
				flag=true;
				break;
			}
		}
		if(flag==false) 
		{
			System.out.println("Value not found");			
		}
	}
	
}
