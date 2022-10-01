package main;

import util.Util;

public class Main {

	public static void main(String[] args) {
		Util util = new Util();
		do {	
			util.questionSection();
			util.input();
			util.sumEvenNumbers();
			util.medEvenNumbers();
			util.calcsCode();
			util.ansSeason();
			util.repeat();
		}while(util.xR == 1);
	}

}
