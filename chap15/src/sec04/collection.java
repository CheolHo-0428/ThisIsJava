package sec04;

import java.util.ArrayList;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			intList.add(i);
		}
		
		for(int number : intList) {
			System.out.println(number);
		}
		
		intList.clear();
		if(intList.isEmpty()) {System.out.println("비어있습니다.");}

	}

}
