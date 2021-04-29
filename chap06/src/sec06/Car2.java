package sec06;

public class Car2 {
	//필드
	private int gas;
	
	//생성자
	public Car2() {}

	//메소드
	public int getGas() {
		return gas;
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	public void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return; //메소드 종료
			}
		}
	}
	
}