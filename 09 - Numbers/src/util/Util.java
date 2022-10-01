package util;

import java.util.Arrays;
import java.util.Scanner;
import color.Colors;

public class Util {
	//Variables
	String tmn, x = " ";
	public int tmnR, xR = 1, countP = 0, countI = 0;
	public double sum = 0, sumP = 0, med = 0, medP = 0, porc;
	public double[] nums;
	public String ansColorY = Colors.YELLOW + Colors.YELLOW_UNDERLINED;
	
	Scanner sc = new Scanner(System.in);

	public void questionSection() {
		System.out.println("--=--=--=--=--=--=--=--Question Section--=--=--=--=--=--=--=--");
	}
	public void error() {
		System.out.println(Colors.RED_BOLD + "ERROR!!" + Colors.RESET);
		System.out.println("This is not a number or this is a real number!!");
	}
		
	public void input(){
		System.out.print("How many numbers you would like to enter?\nAnswer: ");
		tmn = sc.next();
		System.out.println();
		try {
			tmnR = Integer.parseInt(tmn);
			this.nums = new double[tmnR];
			
			for (int i = 0; i < tmnR; i++) {
				System.out.print("Enter a " + (i+1) + "° number: ");
				nums[i] = sc.nextDouble();
				sum += nums[i];
			}
		}catch(NumberFormatException e){
			error();	
		}
	}
	public void sumEvenNumbers(){
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
	}

	public void medEvenNumbers() {
		//If the user doesn't enter any even numbers
		if (countP == 0) {
			
		}
		else {
			medP = sumP / countP;
		}
	}
	public void calcsCode(){
		med = sum / tmnR;
		Arrays.sort(nums);
		porc = countI * 100 / tmnR;//Percentage of the odd numbers
	}
	public void ansSeason() {
		System.out.println("\n--=--=--=--=--=--=--=--Answer Section--=--=--=--=--=--=--=--");
		System.out.println("The sum of numbers if: " + ansColorY + sum + Colors.RESET);
		System.out.println("You type " + ansColorY + tmn + Colors.RESET + " numbers!");
		System.out.format("The avarage of all of them is: " + ansColorY + " %.2f!" + Colors.RESET,med);
		System.out.println("\nThe Smallest of them is: " + ansColorY +  + nums[0] + Colors.RESET);
		System.out.println("O maior número é: "+ ansColorY +  + nums[tmnR - 1] + Colors.RESET);
		System.out.format("A média de números pares é: " +  ansColorY +  "%.2f" + Colors.RESET, medP);
		System.out.println("\nThe percentage of odd numbers is: " + ansColorY + porc + Colors.RESET);
	}
	public void repeat() {
		System.out.println("\nDo you want back to start?\n[1]Yes\n[0]No");
		x = sc.next();
		try {
			xR = Integer.parseInt(x);
			if (xR == 1) {
				
			}
			else if (xR == 0) {
				System.out.println("\nThanks for enjoy the code :D!\n");
			}
			else {
				System.out.println("Invalid Option");
				this.repeat();
			}
			
		}catch(NumberFormatException e) {
			error();
		}
		
	}
	
}