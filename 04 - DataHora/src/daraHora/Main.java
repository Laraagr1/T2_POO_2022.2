package daraHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import color.Colors;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter hrt = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM"); //Peguei só o mês para fazer o switch case
		
		String mes1 = mes.format(LocalDateTime.now());
		
		System.out.println("Dia/Mês/Ano --> " + Colors.YELLOW_UNDERLINED + dft.format(LocalDateTime.now()) +  Colors.RESET);
	
		switch(mes1) {
			case("01"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Janeiro" + Colors.RESET);
				break;
			case("02"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Fevereiro" + Colors.RESET);
			case("03"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Março" + Colors.RESET);
				break;
			case("04"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Abril" + Colors.RESET);
				break;
			case("05"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Maio" + Colors.RESET);
				break;
			case("06"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Junho" + Colors.RESET);
				break;
			case("07"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Julho" + Colors.RESET);
				break;
			case("08"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Agosto" + Colors.RESET);
				break;
			case("09"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Setembro" + Colors.RESET);
				break;
			case("10"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Outubro" + Colors.RESET);
				break;
			case("11"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Novembro" + Colors.RESET);
				break;
			case("12"):
				System.out.println("Mês por extenso --> "+ Colors.YELLOW_UNDERLINED + "Dezembro" + Colors.RESET);
				break;
		}
		System.out.println("Hora:Min:Seg --> " + Colors.YELLOW_UNDERLINED + hrt.format(LocalDateTime.now()) + Colors.RESET);
		
	}
	
}
