package abstractFactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
	
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip theEnemyShip = null;
		
		if(typeOfShip.equals("UFO")) {
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theEnemyShip = new EnemyShip(shipPartsFactory);
			theEnemyShip.setName("UFO Grunt Ship");
		} else
			if(typeOfShip.equals("Boss")) {
				EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
				theEnemyShip = new EnemyShip(shipPartsFactory);
				theEnemyShip.setName("UFO Boss Ship");
			}
		return theEnemyShip;
	}

}
