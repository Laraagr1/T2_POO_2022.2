package daraHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import cores.Cores;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter hrt = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM"); //Peguei só o mês para fazer o switch case
		
		String mes1 = mes.format(LocalDateTime.now());
		
		System.out.println("Dia/Mês/Ano --> " + Cores.YELLOW_UNDERLINED + dft.format(LocalDateTime.now()) +  Cores.RESET);
	
		switch(mes1) {
			case("01"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Janeiro" + Cores.RESET);
				break;
			case("02"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Fevereiro" + Cores.RESET);
			case("03"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Março" + Cores.RESET);
				break;
			case("04"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Abril" + Cores.RESET);
				break;
			case("05"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Maio" + Cores.RESET);
				break;
			case("06"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Junho" + Cores.RESET);
				break;
			case("07"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Julho" + Cores.RESET);
				break;
			case("08"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Agosto" + Cores.RESET);
				break;
			case("09"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Setembro" + Cores.RESET);
				break;
			case("10"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Outubro" + Cores.RESET);
				break;
			case("11"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Novembro" + Cores.RESET);
				break;
			case("12"):
				System.out.println("Mês por extenso --> "+ Cores.YELLOW_UNDERLINED + "Dezembro" + Cores.RESET);
				break;
		}
		System.out.println("Hora:Min:Seg --> " + Cores.YELLOW_UNDERLINED + hrt.format(LocalDateTime.now()) + Cores.RESET);
		
	}
	
}
