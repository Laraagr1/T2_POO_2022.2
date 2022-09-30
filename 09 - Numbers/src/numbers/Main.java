package numbers;

import java.util.Scanner;

import cores.Cores;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//Variables
		String tmn, x = " ";
		int tmnR, xR = 1, countP = 0, countI = 0;
		double sum = 0, sumP = 0, med = 0, medP = 0, porc;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("--=--=--=--=--=--=--=--Seção Perguntas--=--=--=--=--=--=--=--");
			System.out.print("Qual a quantidade de números que deseja digitar?\nResposta: ");
			tmn = sc.next();
			System.out.println();
			try {
				tmnR = Integer.parseInt(tmn);
				double[] nums = new double[tmnR];
				
				for (int i = 0; i < tmnR; i++) {
					System.out.print("Digite o " + (i+1) + "° número: ");
					nums[i] = sc.nextDouble();
					sum += nums[i];
				}
				med = sum / tmnR;
				
				for (int i = 0;i < tmnR; i++) {		
					double resto = nums[i] % 2;
					if (resto == 0) {
						sumP += nums[i];
						countP++;
					}
					else {
						countI++;
					}
				}
				//If the user doesn't enter any even numbers
				if (countP == 0) {
					
				}
				else {
					medP = sumP / countP;
				}
				Arrays.sort(nums);
				porc = countI * 100 / tmnR;//Percentage of the odd numbers
				
				System.out.println("\n--=--=--=--=--=--=--=--Seção Respostas--=--=--=--=--=--=--=--");
				System.out.println("A soma dos números é: " + sum);
				System.out.println("Você digitou " + tmn + " números!");
				System.out.format("A média de todos os número é: %.2f!",med);
				System.out.println("\nO menor número é: " + nums[]);
				System.out.println("O maior número é: " + nums[tmnR - 1]);
				System.out.format("A média de números pares é: %.2f", medP);
				System.out.println("\nA porcentagem de números ímpares entre os números é: " + porc);
			}catch(NumberFormatException e){
				System.out.println(Cores.RED_BOLD + "ERROR!!" + Cores.RESET);
				System.out.println("Isso não é um número ou é um número real!!");
			}
			System.out.println("\nVoltar ao Inicio?\n[1]Sim\n[0]Não");
			x = sc.next();
			try {
				xR = Integer.parseInt(x);
				if (xR == 1) {
					
				}
				else if (xR == 0) {
					System.out.println("\nObrigado por utilizar o código!\n");
				}
				else {
					System.out.println("Opção inválida");
				}
			}catch(NumberFormatException e) {
				System.out.println(Cores.RED_BOLD + "ERROR!!" + Cores.RESET);
				System.out.println("Isso não é um número ou é um número real!!");
			}
			
		}while (xR == 1);
		
	}
	
}
