package sec02;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp2/test05.txt");
		
		char[] data1 = "홍길동".toCharArray();
		
		System.out.println("data1의 길이: " + data1.length);
		
		for(int i=0; i<data1.length; i++) {
			writer.write(data1[i]);
		}
		writer.flush();
		writer.close();

	}

}
