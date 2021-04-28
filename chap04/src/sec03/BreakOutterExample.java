package sec03;

public class BreakOutterExample {

	public static void main(String[] args) {
	Outter:for(int i=1; i<=10; i++) {
			for(char C='A'; C<='Z'; C++) {
				for(char c='a'; c<='z'; c++) {
					System.out.println(i+"-"+C+"-"+c);
					if(c == 'g') {
						break Outter;
					}
				}
			}
		}
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
