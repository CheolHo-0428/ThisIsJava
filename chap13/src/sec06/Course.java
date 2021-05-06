package sec06;

public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, T students) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}
}
