package strategy;

public class TestStrategy {
	public TestStrategy(){}

	public void test() {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog (first): " + sparky.tryingToFly());
		System.out.println("Bird: " + tweety.tryingToFly());
		
		sparky.setFlyingType(new ItFlys());
		System.out.println("Dog (after change): " + sparky.tryingToFly());
	}
	
}
