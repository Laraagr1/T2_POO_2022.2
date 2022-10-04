package main;

import java.util.Scanner;

import color.Colors;
	
public class Main {
	
	public static void main(String[] args) {
		int x = 1, userR;
		String n1, n2, y, user; 
		double sum, sqrt, nr1 = 0, nr2 = 0,  yr = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n" + Colors.BLUE +"What do you want?" + Colors.RESET + "\n"
					+ "[1]Sum 2 numbers\n"
					+ "[2]Square Root of one number");
			System.out.print("\nAnswer: ");
			user = sc.next();
			try {
				userR = Integer.parseInt(user);
				if (userR == 1) {
					System.out.print("\nEnter a "+ Colors.WHITE_UNDERLINED + "1°" + Colors.RESET + " number: ");
					n1 = sc.next();
					System.out.print("Enter a "+ Colors.WHITE_UNDERLINED +  "2°" + Colors.RESET + " number : ");
					n2 = sc.next();
					try {
						nr1 = Double.parseDouble(n1);
						nr2 = Double.parseDouble(n2);
						sum = nr1 + nr2;
						System.out.println("The sum is: " + Colors.YELLOW + Colors.YELLOW_UNDERLINED + sum + Colors.RESET);
					}catch(NumberFormatException e) {
						System.out.println(Colors.RED_BOLD + "ERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!");
					}
		
				}
				else if(userR == 2) {
					System.out.print("\nEnter a number: ");
					n1 = sc.next();
					
					try {
						nr1 = Double.parseDouble(n1);
						sqrt = Math.sqrt(nr1);			
						System.out.format("The square root of " + n1 + " is: " + Colors.YELLOW + Colors.YELLOW_UNDERLINED + "%.2f" + Colors.RESET, sqrt);
					}catch(NumberFormatException e) {
						System.out.println(Colors.RED_BOLD + "ERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!");
					}
					
				}
				else {
					System.out.println(Colors.RED_BOLD + "ERROR!!\n" + Colors.RESET + "Invalid Option!!");
				}
				System.out.print("\n\nCome back?\n"
				+ "[1]Yes\n"
				+ "[0]No\n"
				+ "Answer: ");
				y = sc.next();
				try { 
					yr = Double.parseDouble(y);
					if (yr == 0 || yr == 1) {
						if (yr == 0) {
							System.out.println(Colors.BLUE + "Thanks for enjoy the code :D" + Colors.RESET);
							x = 0;
						}
					}
					else {
						System.out.println(Colors.RED_BOLD + "ERROR!!\n" + Colors.RESET + "Opção invalida");
					}
				}catch(NumberFormatException e){
					System.out.println(Colors.RED_BOLD + "ERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!");
				}
				
			}catch(NumberFormatException e) {
				System.out.println(Colors.RED_BOLD + "ERROR!!\n" + Colors.RESET + "This is not a number or this is a real number!");
			}
			
		}while(x == 1);	
			
	}

}
