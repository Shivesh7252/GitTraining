package Test;

import java.util.Scanner;

public class Bill {
	public static int calculateElectricityBill(String inp1, String inp2, int inp3) {
		int n1 = Integer.parseInt(inp1.substring(5, inp1.length()));
		int n2 = Integer.parseInt(inp2.substring(5, inp2.length()));
		int n = Math.abs((n2 - n1) * inp3);
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prev meter reading");
		String s1 = sc.nextLine();
		System.out.println("Enter current meter reading");
		String s2 = sc.nextLine();
		System.out.println("Enter rate of charge");
		int n = sc.nextInt();
		int n1 = calculateElectricityBill(s1, s2, n);
		System.out.println("Your bill of this month is:" + n1);
		sc.close();
	}
}

//Output:-
//Enter prev meter reading
//ABC2012345
//Enter current meter reading
//ABC2012660
//Enter rate of charge
//4
//Your bill of this month is:1260

//Enter prev meter reading
//CDE12440
//Enter current meter reading
//CDE12500
//Enter rate of charge
//5
//Your bill of this month is:300
