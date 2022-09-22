package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int user, x = 1;
		String n1, n2; 
		double sum, sqrt, nr1 = 0, nr2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(x == 1) {
			System.out.println("O que deseja?\n"
					+ "[1]Somar dois números\n"
					+ "[2]Raiz quadrada de um número");
			System.out.print("Resposta: ");
			user = sc.nextInt();
			
			if (user == 1) {
				System.out.print("\nDigite o primeiro número: ");
				n1 = sc.next();
				System.out.print("Digite o segundo número: ");
				n2 = sc.next();
				try {
					nr1 = Double.parseDouble(n1);
					nr2 = Double.parseDouble(n2);
					sum = nr1 + nr2;
					System.out.println("A soma é: " + sum);
				}catch(NumberFormatException e) {
					System.out.println("Isso não é um número!");
				}
	
			}
			else if(user == 2) {
				System.out.print("\nDigite o número: ");
				n1 = sc.next();
				
				try {
					nr1 = Double.parseDouble(n1);
					sqrt = Math.sqrt(nr1);			
					System.out.format("A raiz quadrada de " + n1 + " é: %.2f", sqrt);
				}catch(NumberFormatException e) {
					System.out.println("Isso não é um número");
				}
				
			}
			else
				System.out.println("Opção Inváliada!");
			System.out.println("\nQuer continuar?\n"
					+ "[1]SIM\n"
					+ "[0]NÃO\n"
					+ "Resposta: ");
			x = sc.nextInt();
			
			if (x == 1 || x == 0) {
				if (x == 1) {
					System.out.println("\n");
				}
				else 
					System.out.println("Obrigado por utilizar o código!");
					x = 0;
			}
			else {
				System.out.println("Opção inválida!");
			}
			
		}	
			
	}

}
