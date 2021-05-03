package sec03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		hashMap.put(new Key(3), "조철호");
		
		String value = hashMap.get(new Key(1));
		String value1 = hashMap.get(new Key(3));
		
		System.out.println(value1);
		

	}

}
