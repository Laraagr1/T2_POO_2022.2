package Equação;

import java.util.Scanner;
import cores.Cores;

public class Main {

	public static void main(String[] args) {
		double a = 0, b, c, delta, x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		while (a == 0) {
			System.out.print(Cores.YELLOW + "Digite o valor de" + Cores.RESET + Cores.RED + " a: " + Cores.RESET);
			a = sc.nextDouble();
		}
		System.out.print(Cores.YELLOW + "Digite o valor de" + Cores.RESET + Cores.GREEN + " b: " + Cores.RESET);
		b = sc.nextDouble();
		System.out.print(Cores.YELLOW + "Digite o valor de" + Cores.RESET + Cores.BLUE + " c: " + Cores.RESET);
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - (4*a) * c;
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("Os valores são: " + x1);
			System.out.println("Os valores são: " + x2);
			System.out.println(delta);
		}
		else {
			System.out.println(Cores.RED_BOLD + "\nInválido!!\nPois o delta é negativo" + Cores.RESET);
		}
		
	}

}
