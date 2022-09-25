package parOuImpar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que verifica se um número inteiro é ímpar ou par

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que verifica se um número inteiro é ímpar ou par\n");
		System.out.println("Digite um número: ");
		String n1 = sc.next();
		int num1;
		try {
			num1 = Integer.parseInt(n1);
			if (num1 % 2 == 0) {
				System.out.println("O número " + n1 + " é par!");
			}
			else if(num1 % 2 != 0) {
				System.out.println("O número " + n1 + " é ímpar!");
			}
			else {
				System.out.println("Opção Inválida");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Isso não é um inteiro!");
		}
		
		
	}

}
