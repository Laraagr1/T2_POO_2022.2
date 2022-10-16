package util;

import java.util.Scanner;

public class Util {
	public int n, num, i, j;
	public double fat;
	Scanner sc = new Scanner(System.in);
	
	public void title() {
		System.out.println("Factorial of numbers\n");
	}
	
	public void InputUser() {
		System.out.println("Enter the number of numbers to be read: ");
		n = sc.nextInt();
	}
	
	public void Factorial() {
		for(i = 1; i <= n; i++) {
			System.out.println("Enter the number you want to see the factorial: ");
			num = sc.nextInt();
			fat = 1;
			for(j = 1; j <= num; j++) {
				fat = fat * j;
			}
			System.out.println("The factorial of " + num + " is " + fat + "!\n");
		}
	}
}
