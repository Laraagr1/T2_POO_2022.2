package util;

import java.util.Scanner;

public class Util {
	public int op, aum;
	public float sal, imp, newSal;
	Scanner sc = new Scanner(System.in);
	
	public void inputUserOp() {
		System.out.println("-----Options menu-----\n1- Tax\n2- New Salary\n3- Classification\n4- Finish the program\n----------------------");
		op = sc.nextInt();
	}
	
    public void options() {
    	
    	if(op == 1) {
    		System.out.println("Enter salary amount: ");
    		sal = sc.nextFloat();
    		  if(sal < 500) {
    			  imp = sal * 5/100;
    		  }
    		  else if(sal >= 500 && sal <= 850 ) {
    		 	  imp = sal * 10/100;
    		  }
    		  else if(sal > 850) {
    			  imp = sal * 15/100;
    		  }
    		System.out.println("The tax amount is " + imp);
    	}
    	
    	else if(op == 2) {
    		System.out.println("Enter salary amount: ");
    		sal = sc.nextFloat();
    		  if(sal > 1500) {
    			  aum = 15;
    		  }
    		  else if(sal >= 750 && sal <= 1500) {
    			  aum = 50;
    		  }
    		  else if(sal >= 450 && sal <= 750) {
    			  aum = 75;
    		  }
    		  else if(sal < 400) {
    			  aum = 100;
    		  }
    		  newSal = sal + aum;
    		  System.out.println("The new salary is " + newSal);
    	}
    	
    	else if(op == 3) {
    		System.out.println("Enter salary amount: ");
    		sal = sc.nextFloat();
    		  if(sal <= 700) {
    			  System.out.println("You are underpaid!");
    		  }
    		  else {
    			  System.out.println("You are well paid!");
    		  }
    	}
    	
    	else if(op == 4) {
    		System.out.println("Finished program!");
    	}
    	
    	else {
    		System.out.println("Invalid option!");
    	}
    }
}
