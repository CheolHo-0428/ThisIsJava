package sec06;

import java.util.Arrays;

public class WildCardExample {
	
	//일반인
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	
	//직장인
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	
	//학생
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " +
				Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일바인과정", 5);
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		workerCourse.add(new Worker("직장인"));
		
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(workerCourse);
		registerCourseWorker(personCourse);
		// registerCourseWorker(studentCourse); //직장인과 일반인 과정만 등록 가능
		System.out.println();
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		//registerCourseStudent(personCourse); //학생과 고등학생 과정만 등록가능
	}

}
