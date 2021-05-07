package sec01;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			System.out.println(x+y);
			return x+y;
		};
		fi.method(2, 5);
		
		fi = (x, y) -> {
			int result = x+y;
			System.out.println(result);
			return result;
		};
		fi.method(1, 3);
		
		fi = (x, y) -> {
			System.out.println(sum(x,y));
			return sum(x,y);
		};
		fi.method(3, 4);
	}

	public static int sum(int x, int y) {
		return x+y;
	}
}
