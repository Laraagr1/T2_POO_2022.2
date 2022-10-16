package util;

import java.util.Scanner;
import color.Colors;

public class Util {
	int num1;
	String n1;
	String controlVar;
	public int controlVarReal = 1;
	Scanner sc = new Scanner(System.in);

	public void title() {
		System.out.println("Program that checks whether an integer is odd or even\n");
	}

	public void input() {
		System.out.println("Enter a number: ");
		n1 = sc.next();
	}

	public void verify() {
		try {
			num1 = Integer.parseInt(n1);
			if (num1 % 2 == 0) {
				System.out.println("The number " + n1 + " is even!");
			} else {
				System.out.println("The number " + n1 + " is odd!");
			}
		} catch (NumberFormatException e) {
			System.out.println("\nThat's not an integer!");
			input();
		}
	}

	public void repeat() {
		System.out.println("\nDo you want back to start?\n[1]Yes\n[0]No");
		controlVar = sc.next();
		try {
			controlVarReal = Integer.parseInt(controlVar);
			if (controlVarReal == 1) {

			} else if (controlVarReal == 0) {
				System.out.println("Thanks for enjoy the code :D!");
			} else {
				System.out.println("Invalid Option!");
				repeat();
			}

		} catch (NumberFormatException e) {
			error();
			repeat();
		}

	}

	public void error() {
		System.out.print(Colors.RED_BOLD + "\nERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!\n");
	}
}