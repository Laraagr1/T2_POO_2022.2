package util;

public class Util {
	public void tableOf() {
		for (int i = 1; i < 11; i++) {
			System.out.println("\nTable of " + i);

			for (int j = 1; j < 11; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}

		}
	}
}
