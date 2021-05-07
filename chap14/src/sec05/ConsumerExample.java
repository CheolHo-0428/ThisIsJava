package sec05;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer;
		
		consumer = (t)->{
			System.out.println(t + "8");
		};
		consumer.accept("java");
		
		
		
		
		BiConsumer<String, String> biConsumer;
		biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("Java", "8");
		
		
		
		DoubleConsumer doubleConsumer;
		doubleConsumer = (d) -> {
			System.out.println("Java" + d);
		};
		doubleConsumer.accept(8);
		
		
		
		
		
		ObjIntConsumer<String> objIntConsumer;
		objIntConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		objIntConsumer.accept("Java", 8);
		
	}

}
