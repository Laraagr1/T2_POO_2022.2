package main;

import utilidades.Util;

public class Main {

	public static void main(String[] args) {
		Util util = new Util();
		util.title();
		do {
			util.input();
			util.verify();
			util.repeat();
		} while (util.controlVarReal == 1);

	}

}