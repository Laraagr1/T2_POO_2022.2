package utilidades;

import java.util.Scanner;

public class Util {
	int num1;
	String n1;
	String controlVar;
	public int controlVarReal = 1;
	Scanner sc = new Scanner(System.in);

	public void title() {
		System.out.println("Programa que verifica se um número inteiro é ímpar ou par\n");
	}

	public void input() {
		System.out.println("\nDigite um número: ");
		n1 = sc.next();
	}

	public void verify() {
		try {
			num1 = Integer.parseInt(n1);
			if (num1 % 2 == 0) {
				System.out.println("O número " + n1 + " é par!");
			} else {
				System.out.println("O número " + n1 + " é ímpar!");
			}
		} catch (NumberFormatException e) {
			System.out.println("\nIsso não é um inteiro!");
			input();
		}
	}

	public void repeat() {
		System.out.print("\nQuer continuar?\n[1]Sim\n[0]Não\nResposta: ");
		controlVar = sc.next();
		try {
			int controlVarReal = Integer.parseInt(controlVar);
			switch (controlVarReal) {
			case 1:
				break;
			case 0:
				System.out.println("Obrigado por curtir o código :D");
				controlVarReal = 0;
				break;
			default:
				System.out.println("Inválido!");
				controlVarReal = 1;
				repeat();
			}
		} catch (NumberFormatException e) {
			System.out.println("Isso não é um número ou não é um numero inteiro!");
			repeat();
		}

	}

}
