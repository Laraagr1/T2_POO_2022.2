package util;

import java.util.Scanner;

public class Util {
	int n;
	boolean prime;
	String controlVar;
	public int controlVarReal;
	Scanner sc = new Scanner(System.in);

	public void title() {
		System.out.println("Program that checks if an integer number is prime\n");
	}

	public void inputUser() {
		System.out.println("Enter a number greater than or equal to 1: ");
	}

	public void isPrime() {
		try {
			n = 0;
			while(n < 1) {
				n = sc.nextInt();
			}
			prime = true;
			for (int i = 2; i < n; i++) {
		        if(n % i == 0) {
				prime = false;
				
				}
			}
			if(n == 1) {
				prime = false;
			}
			
			if (prime) {
				System.out.println("The number " + n + " is prime!");
			} 
			else {
				System.out.println("The number " + n + " isn't prime!");
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
}