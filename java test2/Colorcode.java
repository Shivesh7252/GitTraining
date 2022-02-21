package Test;

import java.util.Scanner;

public class Colorcode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int b = validateColorCode(s1);
		if (b == 1)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

	public static int validateColorCode(String s1) {
		String s2 = s1.substring(1, s1.length());
		if (s1.length() == 7) {
			if (s1.charAt(0) == '#') {
				for (int i = 1; i < s2.length(); i++) {
					if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
						continue;
					else
						return -1;
				}
				return 1;
			} else
				return -1;
		} else
			return -1;

	}
}

//output:-
//#FF9922
//Valid
//Ff9922
//Invalid
