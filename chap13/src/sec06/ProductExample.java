package sec06;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv("티비"));
		product1.setModel("스마트 티비");
		
		Tv tv = product1.getKind();
		String model = product1.getModel();
		
		System.out.println(tv + ": " + model);
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car("자동차"));
		product2.setModel("스포티지");
		
		Car car = product2.getKind();
		String model1 = product2.getModel();
		
		System.out.println(car + ": " + model1);
		

	}

}
