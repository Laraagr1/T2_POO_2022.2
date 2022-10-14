package main;

import secondDegreeEquation.Utils;

public class Main {
	public static void main(String[] args) {
		Utils utils = new Utils();
		do {
			utils.input();// Input of user of a, b, c
			utils.Calcdelta();
			utils.repeat();
		} while (utils.x == 1);
	}

}