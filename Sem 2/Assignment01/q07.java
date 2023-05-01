/*
Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.

Sample Run:
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position 2.
Last occurrence of minimum element is at position 3.
*/

import java.util.Scanner;
public class q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements of array");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("First occurence of max element= "+MaxElement(a));
		int n1=MaxElement(a)-1;
		System.out.println("Last occurence of min element= "+MinElement(a));
		int n2=MinElement(a)-1;
		Occ(a,n1);
		Occ(a,n2);
		
		
	}
	static int MaxElement(int[]a) {
		int max=a[0];
		int position=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				position=i+1;
			}
		}
		return position;
	}
	static int MinElement(int[]a) {
		int min=a[0];
		int position=0;
		for(int i=0;i<a.length;i++) {
			if(min>=a[i]) {
				min=a[i];
				position=i+1;
			}
		}
		return position;
	}
	
	public static void Occ(int[] a,int n) {
		int temp=a[n];
		int Occ=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==temp) {
				Occ+=1;
			}
		}
		System.out.println(a[n]+" occurs "+Occ+" times.");
			
	}

}
