/*
Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal.Sample Run:

Enter a 4-by-4 matrix row by row:
1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16
Sum of the elements in the major diagonal is 34.5
*/

import java.util.Scanner;
public class q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[][] a= new double[4][4];
		System.out.println("Enter the elements of the 2D array:");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Sum="+sumMajorDiagonal(a));

	}
	public static double sumMajorDiagonal(double[][]m) {
		double sum=0.0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					sum+=m[i][j];
				}
				
			}
		}
		return sum;

	
	}

}
