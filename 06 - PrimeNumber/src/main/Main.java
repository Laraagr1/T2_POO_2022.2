package main;

import util.Util;

public class Main {

	public static void main(String[] args) {
		Util util = new Util();
		util.title();
		do {
			util.inputUser();
			util.isPrime();
			util.repeat();
		} while (util.controlVarReal == 1);

	}

}