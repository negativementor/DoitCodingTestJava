package chap08;

import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class P1850_최대공약수Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "3 4\n";
		exInput(sInput1);
		P1850_최대공약수.main(null);
		
		//예제2
		String sInput2 = "3 6\n";
		exInput(sInput2);
		P1850_최대공약수.main(null);
		
		//예제3
		String sInput3 = "500000000000000000 500000000000000002\n";
		exInput(sInput3);
		P1850_최대공약수.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
