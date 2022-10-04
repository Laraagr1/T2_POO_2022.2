package secondDegreeEquation;

import java.util.Scanner;

import color.Colors;

public class Utils {
	double a = 0, b, c;
	double delta;
	double x1;
	double x2;
	public int x = 1;
	Scanner sc = new Scanner(System.in);
	public void input() {
		a = 0; 
		while (a == 0) {
			System.out.print(Colors.YELLOW + "\nEnter a value of" + Colors.RESET + Colors.RED + " a: " + Colors.RESET);
			a = sc.nextDouble();
		}
		System.out.print(Colors.YELLOW + "Enter a value of" + Colors.RESET + Colors.GREEN + " b: " + Colors.RESET);
		b = sc.nextDouble();
		System.out.print(Colors.YELLOW + "Enter a value of" + Colors.RESET + Colors.BLUE + " c: " + Colors.RESET);
		c = sc.nextDouble();
	}
	public void Calcdelta(){
		delta = Math.pow(b, 2) - (4*a) * c;
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.format(Colors.YELLOW + "\nThe value of x1 is: " + Colors.RESET + Colors.PURPLE_UNDERLINED + "%.2f" + Colors.RESET, x1);
			System.out.format(Colors.YELLOW + "\nThe value of x2 is: " + Colors.RESET + Colors.PURPLE_UNDERLINED + "%.2f" + Colors.RESET, x2);
			System.out.format(Colors.YELLOW + "\nThe value of delta is :" + Colors.RESET + Colors.PURPLE_UNDERLINED + "%.2f\n" + Colors.RESET, delta);
		}
		else {
			System.out.println(Colors.RED_BOLD + "\nThis equation has no real roots\nBecause the delta is negative" + Colors.RESET);
		}
	}
	public void repeat() {
		System.out.print("\nDo you want continue?\n[1]Yes\n[0]No\nAnswer: ");
		x = sc.nextInt();
		switch (x) {
		case 1:
			break;
		case 0: 
			System.out.println("Thanks to enjoy my code :D");
			x = 0;
			break;
		}
	}
		
}
