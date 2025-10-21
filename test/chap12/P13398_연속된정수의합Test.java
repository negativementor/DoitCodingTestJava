package chap12;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P13398_연속된정수의합Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "10\n"
					   + "10 -4 3 1 5 6 -35 12 21 -1\n";
		exInput(sInput1);
		P13398_연속된정수의합.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
