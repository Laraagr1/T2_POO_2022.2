package tabuada;

import java.util.Scanner;
import cores.Cores;

public class Main {

	public static void main(String[] args) {
		String formatadoresL = "||=--=--=--=--=--";
		String formatadoresR = "--=--=--=--=--=||";
		String formatting = "||=--=--=--=--=--=--=--=--=--=--=--=--=--=--||";
		String spaceL = "||                ";
		String spaceR = "                ";
		String barra = "||";
		String tabuadaT = "tabuada do ";
		
		for (int i = 1;i <= 10; i++) {
			if (Cores.BLACK.length() + Cores.WHITE_BACKGROUND.length() + formatadoresL.length() + Cores.BLUE.length() + Cores.WHITE_BACKGROUND.length() + tabuadaT.length() + i + Cores.RESET.length() + Cores.BLACK.length() + Cores.WHITE_BACKGROUND.length() + formatadoresR.length() == 95) {
				formatadoresR = "--=--=--=--=--||";
				System.out.println(Cores.BLACK + Cores.WHITE_BACKGROUND + formatadoresL + Cores.BLUE + Cores.WHITE_BACKGROUND + "Tabuada do " + i + Cores.RESET + Cores.BLACK + Cores.WHITE_BACKGROUND + formatadoresR);
				formatadoresR = "--=--=--=--=--=||";
			}
			else {
				System.out.println(Cores.BLACK + Cores.WHITE_BACKGROUND + formatadoresL + Cores.BLUE + Cores.WHITE_BACKGROUND + "Tabuada do " + i + Cores.RESET + Cores.BLACK + Cores.WHITE_BACKGROUND + formatadoresR);
			}
			for(int j = 1; j <= 10;j++) {
				String tab = (spaceL + i + " x " + j + " = " + j*i);
				if (tab.length() + spaceR.length() + barra.length() == 49) {
					spaceR = "             ";
					System.out.println(tab + spaceR + barra);
					spaceR = "                ";
				}
				else if (tab.length() + spaceR.length() + barra.length() == 48 ) {
					spaceR = "               ";
					System.out.println(tab + spaceR + barra);
					spaceR = "                ";
				}		
				else if (tab.length() + spaceR.length() + barra.length() == 47) {
					spaceR = "               ";
					System.out.println(tab + spaceR + barra);
					spaceR = "                ";
				}
				else if (tab.length() + spaceR.length() + barra.length() == 46) {
					spaceR = "                ";
					System.out.println(tab + spaceR + barra);
					spaceR = "                ";
				}
				else if (tab.length() < formatting.length()){
					spaceR = "                 ";
					System.out.println(tab + spaceR + barra);
					spaceR = "                ";
				}
				else {
					
				}
			}
			System.out.println(formatting + Cores.RESET );
		}

	}

} 
