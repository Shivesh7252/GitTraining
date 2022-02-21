package Test;

import java.util.Scanner;

//Java program To calculate
public class Binomial_nCr {

	static int nCr(int n, int r) {
		return fact(n) / (fact(r) * fact(n - r));
	}

//Returns factorial of n
	static int fact(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}

//Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		System.out.println("Enter value of r:");
		int r = sc.nextInt();
		System.out.println("nCr of " + n + " and " + r + " is:" + nCr(n, r));
	}
}
