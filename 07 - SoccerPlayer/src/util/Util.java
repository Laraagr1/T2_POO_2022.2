package util;

import java.util.Scanner;

public class Util {
	public int contTeam, contPlayer, age, averageAge;
	public float weight, height, amount, averageHeight, percentage, tot80;
	Scanner sc = new Scanner(System.in);
	
	public void Code() {
		amount = 0;
		tot80 = 0;
		for(contTeam = 1; contTeam <= 5; contTeam++) {
			averageAge = 0;
			for(contPlayer = 1; contPlayer <= 11; contPlayer++) {
				System.out.println("Enter player age: ");
				age = sc.nextInt();
				System.out.println("Enter player weight: ");
				weight = sc.nextFloat();
				System.out.println("Enter player height: ");
				height = sc.nextFloat();
				if(age < 18) {
					amount = amount + 1;
				}
				averageAge = averageAge + age;
				averageHeight = averageHeight + height;
				if(weight > 80) {
					tot80 = tot80 + 1;
				}
			}
			averageAge = averageAge / 11;
			System.out.println("The average age of the players on this team is " + averageAge);
			
		}
		System.out.println("The number of players under the age of 18 is " + amount);
		averageHeight = averageHeight / 55;
		System.out.println("The average height of all the players in the championship is " + averageHeight);
		percentage = tot80 * 100/55;
		System.out.println("The percentage of players weighing more than 80 kg among all players in the championship is " + percentage);
		
	}
}
