package util;

import java.util.Scanner;

import color.Colors;

public class Util {
	int nR;
	String n;
	boolean prime;
	String controlVar;
	public int controlVarReal;
	Scanner sc = new Scanner(System.in);

	public void title() {
		System.out.print("Program that checks if an integer number is prime\n");
	}

	public void inputUser() {
		System.out.print("\nEnter a number: ");
		n = sc.next();

	}

	public void isPrime() {
		try {
			nR = Integer.parseInt(n);
			prime = true;
			if (nR > 0) {
				for (int i = 2; i < nR; i++) {
					if (nR % i == 0) {
						prime = false;
					}
				}
				if (nR == 1) {
					prime = false;
				}

				if (prime) {
					System.out.println("\nThe number " + nR + " is prime!");
				} else {
					System.out.println("\nThe number " + nR + " isn't prime!");
				}
			} else {
				System.out.println("O número é ou está abaixo de zero!");
				inputUser();
			}
		} catch (NumberFormatException e) {
			error();
			inputUser();
		}
	}

	public void repeat() {
		System.out.print("\nDo you want back to start?\n[1]Yes\n[0]No\nAnswer: ");
		controlVar = sc.next();
		try {
			controlVarReal = Integer.parseInt(controlVar);
			switch (controlVarReal) {
			case 1:
				break;
			case 0:
				System.out.print("\nThanks for using the code!");
				controlVarReal = 0;
				break;
			default:
				System.out.println("\nInvalid!");
				repeat();
				break;
			}
		} catch (NumberFormatException e) {
			error();
			repeat();
		}

	}

	public void error() {
		System.out.println(Colors.RED_BOLD + "\nERROR!!" + Colors.RESET);
		System.out.println("This is not a number or this is a real number!!");
	}
}