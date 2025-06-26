package addon;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the array length:");
		int size = sc.nextInt();
		int a[]=new int[20];
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//Insert
		System.out.println("Enter ur value");
		   int newval=sc.nextInt();
		   System.out.println("Enter the position");
		   int pos=sc.nextInt();
		   for(int n=size;n>=pos-1;n--)
		   {
		       a[n]=a[n-1];
		   }
		   a[pos-1]=newval;
		   size++;
		   for(int i=0;i<size;i++){
		       System.out.print(a[i]);
		       System.out.print(" ");
		   }
		   
		  // Delete
		   System.out.println("Enter the position to delete value");
			int pos1=sc.nextInt();
			
			for(int n=pos1-1;n<size;n++)
			{
				a[n]=a[n+1];
			}
			size--;
			for(int i=0;i<size;i++){
			       System.out.print(a[i]);
			       System.out.print(" ");
			   }
		 
			// Update
	System.out.println("Enter the position to update value");
	int pos2=sc.nextInt();
	a[pos2-1]=sc.nextInt();	
	for(int i=0;i<size;i++){
	       System.out.print(a[i]);
	       System.out.print(" ");
	   }
	}
	
}
	


