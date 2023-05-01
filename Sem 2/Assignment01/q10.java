/*
Write a method that returns the sum of all the elements in a specified column in a matrix
using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column.
Sample Run:
Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0
*/

import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[][]a=new double[3][4];
		System.out.println("Enter the elements of the 2D array:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Enter the column index:");
		int n=sc.nextInt();
		System.out.println("Sum of the given column= "+sumColumn(a,n));
		
	}
	public static double sumColumn(double[][]m,int columnIndex) {
		double sum=0.0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(j==columnIndex) {
					sum+=m[i][j];
				}
			}
		}
		return sum;
	}

}
