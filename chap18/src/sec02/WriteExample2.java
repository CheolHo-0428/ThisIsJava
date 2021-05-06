package sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp2/test4.txt");
		
		byte[] data1 = "ABCDEF\r\n".getBytes("UTF-8");
		byte[] data2 = "자바를 열심히 복습하세요.".getBytes("UTF-8");
		
		os.write(data1);
		os.write(data2);
		os.flush();
		os.close();

	}

}
