package addon;

import java.util.Arrays;
import java.util.Scanner;

public class Day9Task1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]= {4,2,35,5,3,12,77};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter a Target: ");
		int target=s.nextInt();
		int left=0;
		int right=a.length;
		int mid;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		while(left<right) {
			mid=(left+right)/2;
			if(a[mid]<target) {
				left=mid+1;
			}
			else if(a[mid]>=target) {
				right=mid;
			}
		}
		try
		{
			if(((a[left])|(a[right]))>=target)
			{
				System.out.println("Low Bound found at "+left+" and value "+a[left]);	
			}
			else if(target>(a[left]|a[right]))
			{
				System.out.println("Out of bound");
			}
		}
		catch(Exception e)
		{
			System.out.println("Out of bound,no low bound");
		}
		
		
	}

}