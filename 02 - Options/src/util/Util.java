package util;

import java.util.Scanner;

import color.Colors;

public class Util {
	public int x = 1, nr1 = 0, nr2 = 0, userR;
	public String n1, n2, y, user;
	public double sum, sqrt, yr = 0;
	Scanner sc = new Scanner(System.in);

	public void InputUser() {
		System.out.println("\n" + Colors.BLUE + "What do you want?" + Colors.RESET + "\n" + "[1]Sum 2 numbers\n"
				+ "[2]Square Root of one number");
		System.out.print("\nAnswer: ");
		user = sc.next();
	}

	public void sumTwoNumbers() {
		System.out.println("--=--=--=--=--=--=--Sum of two Numbers--=--=--=--=--=--");
		System.out.print("Enter a " + Colors.WHITE_UNDERLINED + "1°" + Colors.RESET + " number: ");
		n1 = sc.next();
		System.out.print("Enter a " + Colors.WHITE_UNDERLINED + "2°" + Colors.RESET + " number: ");
		n2 = sc.next();
		try {
			nr1 = Integer.parseInt(n1);
			nr2 = Integer.parseInt(n2);
			sum = nr1 + nr2;
			System.out.print("The sum is: " + Colors.YELLOW + Colors.YELLOW_UNDERLINED + sum + Colors.RESET);
		} catch (NumberFormatException e) {
			Error();
			sumTwoNumbers();
		}
	}

	public void sqrt() {
		System.out.println("--=--=--=--=--=--=--Square Root--=--=--=--=--=--");
		System.out.print("Enter a number: ");
		n1 = sc.next();

		try {
			nr1 = Integer.parseInt(n1);
			sqrt = Math.sqrt(nr1);
			System.out.format("The square root of " + n1 + " is: " + Colors.YELLOW + Colors.YELLOW_UNDERLINED + "%.2f"
					+ Colors.RESET, sqrt);
		} catch (NumberFormatException e) {
			Error();
			sqrt();
		}
	}

	public void TestInteger() {
		try {
			userR = Integer.parseInt(user);
			if (userR == 1) {
				sumTwoNumbers();
			} else if (userR == 2) {
				sqrt();
			} else {
				invalidOption();
				InputUser();
				TestInteger();
			}

		} catch (NumberFormatException e) {
			Error();
			InputUser();
			TestInteger();
		}
	}

	public void repeat() {
		System.out.print("\n\nCome back?\n" + "[1]Yes\n" + "[0]No\n" + "Answer: ");
		y = sc.next();
		try {
			yr = Double.parseDouble(y);
			if (yr == 1) {

			} else if (yr == 0) {
				System.out.println(Colors.BLUE + "\nThank's for enjoy the code :D" + Colors.RESET);
				x = 0;
			} else {
				invalidOption();
				repeat();
			}
		} catch (NumberFormatException e) {
			Error();
			repeat();
		}

	}

	public void Error() {
		System.out.println(
				Colors.RED_BOLD + "\nERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!\n");
	}

	public void invalidOption() {
		System.out.println(Colors.RED_BOLD + "\nERROR!!\n" + Colors.RESET + "Invalid Option!!\n");
	}
}
