package tabuada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int user;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("De qual número você deseja a tabuada?\nResposta: ");
		user = sc.nextInt();
		do {
			for (int i = 1;i <= 10; i++) {
				System.out.println(user + " x " + i + " = " + user*i);
			}
		}
		
	}

}
