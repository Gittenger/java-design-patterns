package strategy;

// Interface with two subclasses
public interface Flys {
	String fly();
}

// when a field is of type "Flys" you specify which subclass by using a constructor during implementation
class ItFlys implements Flys {
	public String fly() {
		return "Flying!";
	}
}

class CantFly implements Flys {
	public String fly() {
		return "I can't fly!";
	}
}
