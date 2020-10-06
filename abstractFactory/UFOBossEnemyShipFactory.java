package abstractFactory;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		// TODO Auto-generated method stub
		return new ESBossGun();
	}

	@Override
	public ESEngine addESEngine() {
		// TODO Auto-generated method stub
		return new ESBossEngine();
	}
	
}
