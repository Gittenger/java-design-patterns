package factory;

import java.util.Scanner;

public class TestFactory {

	public static void main(String[] args) {
//
//		bad way
		
//		EnemyShip theEnemy = null;
//		Scanner userInput = new Scanner(System.in);
//		
//		String enemyShipOption = "";
//		System.out.println("What type of ship? (U / R)");
//		
//		if(userInput.hasNextLine()) {
//			
//			enemyShipOption = userInput.nextLine();
//		}
//		
//		if(enemyShipOption.equals("U")) {
//			theEnemy = new UFOEnemyShip();
//		} else {
//			if(enemyShipOption.equals("R")) {
//				theEnemy = new RocketEnemyShip();
//			}
//		}
//		
//		doStuffEnemyShip(theEnemy);
		
//		
//		factory way
		
		ShipFactory shipFactory = new ShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship? (U / R / B)");
		
		if(userInput.hasNextLine()) {
		
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			
			if(theEnemy != null) {
				doStuffEnemyShip(theEnemy);
			}
			else System.out.println("Error reading input");
		}
	}
	
	public static void doStuffEnemyShip(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}

}
