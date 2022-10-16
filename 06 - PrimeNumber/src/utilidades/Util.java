package utilidades;

import java.util.Scanner;

import color.Colors;

public class Util {
	String num;
	int numR = 0;
	boolean prime;
	String controlVar;
	public int controlVarReal;
	Scanner sc = new Scanner(System.in);

	public void title() {
		System.out.println("Program that checks if an integer number is prime\n");
	}

	public void inputUser() {
		System.out.print("Enter a number: ");
		num = sc.next();
		try {
			numR = Integer.parseInt(num);
			if (numR >= 2) {
				isPrime();
			}
			else if( numR == 1) {
				System.out.println("\nO número 1 não é primo!\n");
				inputUser();
			}
			else { 
				error();
				inputUser();

			}
		} catch (NumberFormatException e) {
			error();
			inputUser();
		}

	}

	public void isPrime() {
		try {

			prime = true;
			for (int i = 2; i < numR; i++) {
				if (numR % i == 0) {
					prime = false;
				} else if (numR == 1) {
					prime = false;
				}
			}
			if (numR < 2) {
				System.out.println("1 isn't prime!!");
			}
			else if (prime) {
				System.out.println("The number " + num + " is prime!");
			} else {
				System.out.println("The number " + num + " isn't prime!");
			}
		} catch (Exception e) {
			System.out.println("This is not an integer number!");
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
				System.out.println("Thanks for using the code!");
				controlVarReal = 0;
				break;
			default:
				System.out.println("Invalid!");
				repeat();
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("This is not a number or not an integer number!");
			repeat();
		}

	}
	public void error() {
		System.out.println(Colors.RED_BOLD + "\nERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!\n");
	}
}
