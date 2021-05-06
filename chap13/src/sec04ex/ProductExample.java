package sec04ex;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> pd1 = new Product<Tv, String>();
		pd1.setKind(new Tv());
		pd1.setModel("스마트TV");
		Tv tv = pd1.getKind();
		String tvModel = pd1.getModel();
		
		Product<Car, String> pd2 = new Product<Car, String>();
		pd2.setKind(new Car());
		Car car = pd2.getKind();
		
		pd2.setModel("벤츠");
		String carModel = pd2.getModel();
	}

}
