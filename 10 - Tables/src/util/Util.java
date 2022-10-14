package util;

public class Util {
	String formatters = "--=--=--=--=--=--";
	String bar = "||";
	String finalFormatters = "||--=--=--=--=--=--=--=--=--=--=--=--=--=--=--||\n";
	String space = "                 ";
	public void tableOf() {
		for (int i = 1; i < 11; i++) {
			System.out.println(bar + formatters + "Table of " + i + formatters + bar);
			
			for (int j = 1; j < 11; j++) {
				System.out.println(bar + space + i + " x " + j + " = " + i * j + space + bar);
			}
			System.out.println(finalFormatters);
		}
	}
}
