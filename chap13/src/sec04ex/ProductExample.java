package sec04ex;

public class ProductExample {

	public static void main(String[] args) {
		Product<Car, String> product1 = new Product<Car, String>();
		product1.setKind(new Car());
		product1.setModel("제니시스");
		
		String v1 = product1.getKind().get();
		System.out.println(v1);
		System.out.println(product1.getModel());
	}

}
