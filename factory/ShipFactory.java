package factory;

public class ShipFactory {
	public EnemyShip makeEnemyShip(String newShipType) {		
		if(newShipType.equals("U")) {
			return new UFOEnemyShip();
		} else 
			if(newShipType.equals("R")) {
				return new RocketEnemyShip();
			}
			else 
				if(newShipType.equals("B")) {
					return new BigUFOShip();	
				}
				else return null;
		
	}
}
