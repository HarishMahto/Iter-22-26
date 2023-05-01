/*
Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.

public static int sum_Of_Digits(int n)
*/

public class q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9294;
		System.out.println("Sum="+sum_Of_Digits(n));
	}
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while(n>0||sum>9) {
			if(n==0) {
				n=sum;
				sum=0;
			}
			sum+=(n%10);
			n/=10;
		}
		return sum;
		
	}


}
