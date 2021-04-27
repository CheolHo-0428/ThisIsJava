package sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*100);
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=80) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println(score + "점은 " + grade + "등급 입니다.");
	}
}
