package addon;

import java.util.Arrays;
import java.util.Scanner;

public class Day2Task1 {
	public static void main(String[] args) {
		int[] a= {4,2,10,7,5,3,8};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int s=0;
		int e=a.length-1;
		while(s<e) {
			int c=a[s];
			a[s]=a[e];
			a[e]=c;
			s++;
			e--;
		}
		System.out.println(Arrays.toString(a));
		
	}

}