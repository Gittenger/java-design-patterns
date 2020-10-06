package abstractFactory;

public class TestingAbstractFactory {

	public static void main(String[] args) {

		EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = MakeUFOs.orderShip("UFO");
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderShip("Boss");
		System.out.println(theBoss + "\n");
	}

}
