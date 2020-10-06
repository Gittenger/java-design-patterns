package abstractFactory;

public class EnemyShip {
	
	private String name;
	ESWeapon weapon;
	ESEngine engine;
	EnemyShipFactory shipFactory;
	public String getName() {return name;}
	public void setName(String newName) {name = newName;} 
	
	public EnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}
	
	public void makeShip() {
		System.out.println("Making enemy ship " + name);
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
	}
	
	public String toString() {
		String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
		
		return infoOnShip;
	}
	
	public void displayEnemyShip() {
		System.out.println("Ship name: " + name);
	}

	public void followHeroShip() {
		System.out.println(name + " is following the hero ship at " + engine);
	}
	
	public void enemyShipShoots() {
		System.out.println(name + " fires and does " + weapon);
	}
}
