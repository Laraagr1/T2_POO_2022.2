package secondDegreeEquation;

import java.util.Scanner;
import cores.Cores;

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
			System.out.print(Cores.YELLOW + "\nEnter a value of" + Cores.RESET + Cores.RED + " a: " + Cores.RESET);
			a = sc.nextDouble();
		}
		System.out.print(Cores.YELLOW + "Enter a value of" + Cores.RESET + Cores.GREEN + " b: " + Cores.RESET);
		b = sc.nextDouble();
		System.out.print(Cores.YELLOW + "Enter a value of" + Cores.RESET + Cores.BLUE + " c: " + Cores.RESET);
		c = sc.nextDouble();
	}
	public void Calcdelta(){
		delta = Math.pow(b, 2) - (4*a) * c;
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.format(Cores.YELLOW + "\nThe value of x1 is: " + Cores.RESET + Cores.PURPLE_UNDERLINED + "%.2f" + Cores.RESET, x1);
			System.out.format(Cores.YELLOW + "\nThe value of x2 is: " + Cores.RESET + Cores.PURPLE_UNDERLINED + "%.2f" + Cores.RESET, x2);
			System.out.format(Cores.YELLOW + "\nThe value of delta is :" + Cores.RESET + Cores.PURPLE_UNDERLINED + "%.2f\n" + Cores.RESET, delta);
		}
		else {
			System.out.println(Cores.RED_BOLD + "\nThis equation has no real roots\nBecause the delta is negative" + Cores.RESET);
		}
	}
	public void repeat() {
		System.out.print("\nDo you want continue?\n[1]Yes\n[0]No\nAnswer: ");
		x = sc.nextInt();
		switch (x) {
		case 1:
			break;
		case 2: 
			System.out.println("Thanks to enjoy my code :D");
			x = 0;
			break;
		}
	}
		
}
