package tabuada;

import java.util.Scanner;
import cores.Cores;

public class Main {

	public static void main(String[] args) {
		for (int i = 1;i <= 10; i++) {
			System.out.println(Cores.BLACK + Cores.WHITE_BACKGROUND +  "||=--=--=--=--=--" + Cores.BLUE + Cores.WHITE_BACKGROUND + "Tabuada do " + i + Cores.RESET + Cores.BLACK + Cores.WHITE_BACKGROUND + "--=--=--=--=--=||");
			for(int j = 1; j <= 10;j++) {
				System.out.println("||                " + i + " x " + j + " = " + j*i + "               ||");
			}
			System.out.println("||=--=--=--=--=--=--=--=--=--=--=--=--=--=--=||" + Cores.RESET );
			System.out.println();
		}
		
	}

}
