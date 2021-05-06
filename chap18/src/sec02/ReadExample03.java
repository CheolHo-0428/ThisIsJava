package sec02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample03 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp2/test.txt");
		int readCharNo1;
		
		char[] cbuf = new char[4];
		
		readCharNo1= reader.read(cbuf, 0, 2);
		
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(readCharNo1+"cbuf[" + i +"]:" + cbuf[i]);
		}
		
		reader.close();
	}

}
