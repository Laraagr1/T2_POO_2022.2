package tabuada;

import color.Colors;

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
			//Verificando se essa string é maior que 49 que é o excede a formatação 
			if (Colors.BLACK.length() + Colors.WHITE_BACKGROUND.length() + formatadoresL.length() + Colors.BLUE.length() + Colors.WHITE_BACKGROUND.length() + tabuadaT.length() + i + Colors.RESET.length() + Colors.BLACK.length() + Colors.WHITE_BACKGROUND.length() + formatadoresR.length() == 95) {
				formatadoresR = "--=--=--=--=--||";
				System.out.println(Colors.BLACK + Colors.WHITE_BACKGROUND + formatadoresL + Colors.BLUE + Colors.WHITE_BACKGROUND + "Tabuada do " + i + Colors.RESET + Colors.BLACK + Colors.WHITE_BACKGROUND + formatadoresR);
				formatadoresR = "--=--=--=--=--=||";
			}
			else {
				System.out.println(Colors.BLACK + Colors.WHITE_BACKGROUND + formatadoresL + Colors.BLUE + Colors.WHITE_BACKGROUND + "Tabuada do " + i + Colors.RESET + Colors.BLACK + Colors.WHITE_BACKGROUND + formatadoresR);
			}
			for(int j = 1; j <= 10;j++) {
				String tab = (spaceL + i + " x " + j + " = " + j*i);
				//Fazendo a mesma coisa aqui
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
			System.out.println(formatting + Colors.RESET );
		}

	}

} 
