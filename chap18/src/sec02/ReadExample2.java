package sec02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp2/test.txt");
		
		int readByteNo;
		
		byte[] readBytes = new byte[100];
		
		String data = "";
		
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) {
				break;
			}
			System.out.println("읽어 들인 바이트양: " + readByteNo);
			System.out.println("읽어 들인 내용" + readBytes);
			data += new String(readBytes, 0, readByteNo, "UTF-8");
		}
		System.out.println(data);
		is.close();

	}

}
