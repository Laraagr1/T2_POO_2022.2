package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int user, x = 1;
		String n1, n2, y; 
		double sum, sqrt, nr1 = 0, nr2 = 0,  yr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(x == 1) {
			System.out.println("\nO que deseja?\n"
					+ "[1]Somar dois números\n"
					+ "[2]Raiz quadrada de um número");
			System.out.print("\nResposta: ");
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
			else {
				System.out.println("Opção Inváliada!");
			}
			System.out.print("\n\nVoltar ao início?\n"
			+ "[1]SIM\n"
			+ "[0]NÃO\n"
			+ "Resposta: ");
			y = sc.next();
			try { 
				yr = Double.parseDouble(y);
				if (yr == 0 || yr == 1) {
					if (yr == 0) {
						System.out.println("Obrigado por utilizar o código!");
						x = 0;
					}
				}
				else {
					System.out.println("Opção invalida");
				}
			}catch(NumberFormatException e){
				System.out.println("Não é um número");
				System.out.println("Opção inválida!");
			}
			
		}	
			
	}

}
