package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1414_불우이웃돕기Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "3\n"
					   + "abc\n"
					   + "def\n"
					   + "ghi\n";
		exInput(sInput1);
		P1414_불우이웃돕기.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
