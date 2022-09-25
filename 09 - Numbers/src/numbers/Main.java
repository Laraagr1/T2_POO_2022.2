package numbers;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int tmn;
		double sum = 0, sumP = 0, med = 0, medP = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--=--=--=--=--=--=--=--Seção Perguntas--=--=--=--=--=--=--=--");
		System.out.print("Qual a quantidade de números que deseja digitar?\nResposta: ");
		tmn = sc.nextInt();
		System.out.println();
		
		double[] nums = new double[tmn];
		
		for (int i = 0; i < tmn; i++) {
			System.out.print("Digite o " + (i+1) + "° número: ");
			nums[i] = sc.nextDouble();
			sum += nums[i];
		}
		med = sum / tmn;
		
		int countP = 0;
		int countI = 0;
		for (int i = 0;i < tmn; i++) {		
			double resto = nums[i] % 2;
			if (resto == 0) {
				sumP += nums[i];
				countP++;
			}
			else {
				countI++;
			}
		}
		medP = sumP / countP;
		
		double porc = countI * 100 / tmn;//Porcentagem de números Ímpares
		
		System.out.println("\n--=--=--=--=--=--=--=--Seção Respostas--=--=--=--=--=--=--=--");
		System.out.println("A soma dos números é: " + sum);
		System.out.println("Você digitou " + tmn + " números!");
		System.out.format("A média de todos os número é: %.2f!",med);
		System.out.println("\nO maior número é: " + nums[tmn - 1]);
		System.out.println("O menor número é: " + nums[0]);
		System.out.format("A média de números pares é: %.2f", medP);
		System.out.println("\nA porcentagem de números ímpares entre os números é: " + porc);
		
	}
	
}
