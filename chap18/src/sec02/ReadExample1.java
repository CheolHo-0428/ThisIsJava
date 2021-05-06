package sec02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp2/test.txt");
		int readByte;
		String data = "";
		while(true) {
			readByte = is.read(); //IOException
			if(readByte == -1) {
				break;
			}
			System.out.println(readByte);
			System.out.println((char) readByte);
			System.out.println();
			
			byte[] readBytes = {(byte) readByte};
			
			data += new String(readBytes,"UTF-8");
		}
		System.out.println(data);
		is.close();

	}

}
