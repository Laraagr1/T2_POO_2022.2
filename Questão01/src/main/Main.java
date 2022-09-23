package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programa que verifica se um n�mero inteiro � �mpar ou par

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que verifica se um n�mero inteiro � �mpar ou par\n");
		System.out.println("Digite um n�mero: ");
		String n1 = sc.next();
		int num1;
		try {
			num1 = Integer.parseInt(n1);
			if (num1 % 2 == 0) {
				System.out.println("O n�mero " + n1 + " � par!");
			}
			else {
				System.out.println("O n�mero " + n1 + " � �mpar!");
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Isso n�o � um inteiro!");
		}
		
		
	}

}
