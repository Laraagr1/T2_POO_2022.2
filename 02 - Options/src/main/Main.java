package main;

import util.Util;

public class Main {

	public static void main(String[] args) {
		Util util = new Util();
		do {
			util.InputUser();
			util.TestInteger();
			util.repeat();
		} while (util.x == 1);
	}

}
