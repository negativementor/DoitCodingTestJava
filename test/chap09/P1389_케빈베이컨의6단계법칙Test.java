package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1389_케빈베이컨의6단계법칙Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5 5\n"
					   + "1 3\n"
					   + "1 4\n"
					   + "4 5\n"
					   + "4 3\n"
					   + "3 2\n";
		exInput(sInput1);
		P1389_케빈베이컨의6단계법칙.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
