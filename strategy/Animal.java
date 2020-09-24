package strategy;

public class Animal {

//	field for implementing interface
	public Flys flyingType;
	
//	using generic "fly" method on interface
	public String tryingToFly() {
		return flyingType.fly();
	}
	
//	method to change type on flying interface, use constructor in method call
	public void setFlyingType(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
