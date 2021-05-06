package sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 90);
		map.put("신용권", 80);
		map.put("홍길동", 100);
		map.put("임꺽정", 600);
		
		System.out.println("엔트리 수: " + map.size());
		System.out.println("홍길동 : " + map.get("홍길동"));
		
		Set<String> set = map.<String>keySet();
		Iterator<String> iterator = set.<String>iterator();
		
		while(iterator.hasNext()) {
			String str = iterator.next();
			int value = map.get(str);
			System.out.println(str + ": " + value);
		}
		
		map.clear();
		if(map.isEmpty()) {System.out.println("비어 있습니다.");}
	}

}
