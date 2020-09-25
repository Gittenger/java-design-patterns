package observer;

public class TestObserver {

	public static void main(String[] args) {

		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(649.77);
		stockGrabber.setGOOGPrice(340.32);

		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(649.77);
		stockGrabber.setGOOGPrice(340.32);

		stockGrabber.unregister(observer2);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(649.77);
		stockGrabber.setGOOGPrice(340.32);
	}

}
