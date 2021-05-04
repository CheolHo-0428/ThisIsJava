package sec03;

public class ProductExmaple {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		System.out.println("티비 모델명: " + tvModel);
		
		Product<Car, String> product2 = new Product<Car, String>();
		
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		System.out.println("자동차모델: " + product2.getModel());
		
		

	}

}
