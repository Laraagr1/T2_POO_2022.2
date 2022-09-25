package main;

import java.awt.Color;
import java.util.Scanner;

import cores.Cores;


public class Main {
	
	public static void main(String[] args) {
		int x = 1, userR;
		String n1, n2, y, user; 
		double sum, sqrt, nr1 = 0, nr2 = 0,  yr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n" + Cores.BLUE +"O que deseja?" + Cores.RESET + "\n"
					+ "[1]Somar dois números\n"
					+ "[2]Raiz quadrada de um número");
			System.out.print("\nResposta: ");
			user = sc.next();
			try {
				userR = Integer.parseInt(user);
				if (userR == 1) {
					System.out.print("\nDigite o "+ Cores.WHITE_UNDERLINED + "1°" + Cores.RESET + " número: ");
					n1 = sc.next();
					System.out.print("Digite o "+ Cores.WHITE_UNDERLINED +  "2°" + Cores.RESET + " número: ");
					n2 = sc.next();
					try {
						nr1 = Double.parseDouble(n1);
						nr2 = Double.parseDouble(n2);
						sum = nr1 + nr2;
						System.out.println("A soma é: " + Cores.YELLOW + Cores.YELLOW_UNDERLINED + sum + Cores.RESET);
					}catch(NumberFormatException e) {
						System.out.println(Cores.RED_BOLD + "ERROR!!\n" + Cores.RESET + "Isso não é um número!");
					}
		
				}
				else if(userR == 2) {
					System.out.print("\nDigite o número: ");
					n1 = sc.next();
					
					try {
						nr1 = Double.parseDouble(n1);
						sqrt = Math.sqrt(nr1);			
						System.out.format("A raiz quadrada de " + n1 + " é: " + Cores.YELLOW + Cores.YELLOW_UNDERLINED + "%.2f" + Cores.RESET, sqrt);
					}catch(NumberFormatException e) {
						System.out.println(Cores.RED_BOLD + "ERROR!!\n" + Cores.RESET + "Isso não é um número");
					}
					
				}
				else {
					System.out.println(Cores.RED_BOLD + "ERROR!!\n" + Cores.RESET + "Opção Inváliada!");
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
							System.out.println(Cores.BLUE + "Obrigado por utilizar o código!" + Cores.RESET);
							x = 0;
						}
					}
					else {
						System.out.println(Cores.RED_BOLD + "ERROR!!\n" + Cores.RESET + "Opção invalida");
					}
				}catch(NumberFormatException e){
					System.out.println(Cores.RED_BOLD + "ERROR!!\n" + Cores.RESET + "Opção inválida! Isso não é um número!");
				}
				
			}catch(NumberFormatException e) {
				System.out.println(Cores.RED_BOLD + "ERROR!!\n" + Cores.RESET + "Isso não é um número ou é um número real!");
			}
			
		}while(x == 1);	
			
	}

}
