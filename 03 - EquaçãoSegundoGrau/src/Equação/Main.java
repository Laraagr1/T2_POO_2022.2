package Equação;

import java.util.Scanner;

import cores.Cores;

public class Main {


	public static void main(String[] args) {
		double a = 0, b, c, delta, x1, x2;
		
		Cores cores = new Cores();
		Scanner sc = new Scanner(System.in);
		
		while (a == 0) {
			System.out.print(Cores.BLUE + "Digite o valor de a: " + Cores.RESET);
			a = sc.nextDouble();
		}
		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble();
		System.out.print("Digite o valor de b: ");
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
			System.out.println("Inválido!! Pois o delta é negativo");
		}
		
	}

}
