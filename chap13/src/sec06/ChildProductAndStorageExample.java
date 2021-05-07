package sec06;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv("티비"));
		product.setModel("스마트 티비");
		product.setCompany("삼성");
		
		StorageImpl<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv("티비"), 0);
		Tv tv = storage.get(0);
		
		System.out.println(tv);
	}
}
