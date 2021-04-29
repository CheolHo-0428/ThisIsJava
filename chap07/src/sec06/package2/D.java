package sec06.package2;

import sec06.package1.A;

public class D extends A{
	
	D(){
		super();				// 상속 받았기 때문에 가능
		this.field = "value";
		this.method();
	}
	
}
