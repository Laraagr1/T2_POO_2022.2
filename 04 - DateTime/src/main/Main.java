package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import color.Colors;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter hrt = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM"); // Peguei só o mês para fazer o switch case

		String month = mes.format(LocalDateTime.now());

		System.out.println("Day/Month/Year --> " + Colors.YELLOW_UNDERLINED + dft.format(LocalDateTime.now()) + Colors.RESET);

		switch (month) {
		case ("01"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "January" + Colors.RESET);
			break;
		case ("02"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "February" + Colors.RESET);
			break;
		case ("03"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "March" + Colors.RESET);
			break;
		case ("04"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "April" + Colors.RESET);
			break;
		case ("05"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "May" + Colors.RESET);
			break;
		case ("06"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "June" + Colors.RESET);
			break;
		case ("07"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "July" + Colors.RESET);
			break;
		case ("08"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "August" + Colors.RESET);
			break;
		case ("09"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "September" + Colors.RESET);
			break;
		case ("10"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "October" + Colors.RESET);
			break;
		case ("11"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "November" + Colors.RESET);
			break;
		case ("12"):
			System.out.println("Month in full --> " + Colors.YELLOW_UNDERLINED + "December" + Colors.RESET);
			break;
		}
		System.out.println("Hour:Min:Sec --> " + Colors.YELLOW_UNDERLINED + hrt.format(LocalDateTime.now()) + Colors.RESET);
	}
}

