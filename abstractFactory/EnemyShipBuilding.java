package abstractFactory;

public abstract class EnemyShipBuilding {
	
	protected abstract EnemyShip makeEnemyShip(String typeOfShip);
	
	public EnemyShip orderShip(String typeOfShip) {
		EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
		
		theEnemyShip.makeShip();
		theEnemyShip.displayEnemyShip();
		theEnemyShip.followHeroShip();
		theEnemyShip.enemyShipShoots();
		
		return theEnemyShip;
	}
}
