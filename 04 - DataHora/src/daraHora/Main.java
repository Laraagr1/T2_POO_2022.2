package daraHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter hrt = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM"); //Peguei só o mês para fazer o switch case
		
		String mes1 = mes.format(LocalDateTime.now());
		
		System.out.println("Dia/Mês/Ano --> " + dft.format(LocalDateTime.now()));
	
		switch(mes1) {
			case("01"):
				System.out.println("Mês por extenso --> Janeiro");
				break;
			case("02"):
				System.out.println("Mês por extenso --> Fevereiro");
			case("03"):
				System.out.println("Mês por extenso --> Março");
				break;
			case("04"):
				System.out.println("Mês por extenso --> Abril");
				break;
			case("05"):
				System.out.println("Mês por extenso --> Maio");
				break;
			case("06"):
				System.out.println("Mês por extenso --> Junho");
				break;
			case("07"):
				System.out.println("Mês por extenso --> Julho");
				break;
			case("08"):
				System.out.println("Mês por extenso --> Agosto");
				break;
			case("09"):
				System.out.println("Mês por extenso --> Setembro");
				break;
			case("10"):
				System.out.println("Mês por extenso --> Outubro");
				break;
			case("11"):
				System.out.println("Mês por extenso --> Novembro");
				break;
			case("12"):
				System.out.println("Mês por extenso --> Dezembro");
				break;
		}
		System.out.println("Hora:Min:Seg --> " + hrt.format(LocalDateTime.now()));
		
	}
	
}
