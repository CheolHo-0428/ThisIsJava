package sec06;

import java.util.Arrays;

public class WildCardExample {
	//모든 과정
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getName()));
	}
}
