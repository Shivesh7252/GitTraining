package com.org.gen.day1;

//java hands on
public class FirstLetter {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 6; j++) {
				if (i == 3 || i == 4) {
					if (j > 2)
						System.out.print(" ");
					else
						System.out.print("* ");
				} else if (i == 7 || i == 8) {
					if (j < 5)
						System.out.print("  ");
					else
						System.out.print("* ");

				} else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}