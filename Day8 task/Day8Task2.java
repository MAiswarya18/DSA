package addon;

import java.util.Arrays;
import java.util.Scanner;

public class Day8Task2 {
	public static void main(String args[])
	{
		int a[]= {23,45,66,4,3,77};
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Enter number to find:");
		int find=sc.nextInt();
		BinarySearch(a,0,a.length-1,find);
	}
	public static int BinarySearch(int[] a,int left,int right,int find)
	{
		int mid=(left+right)/2;
		if(a[mid]==find)
		{
			return mid;
		}
		if(left>right)
		{
			return 1;
		}
		if(find>a[mid])
		{
			return BinarySearch(a,left+1,right,find);
		}
		else
		{
			return BinarySearch(a,left,right+1,find);
		}
	}

}
