package chap11;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1722_순열의순서Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "4\n"
				   + "1 3\n";
		exInput(sInput1);
		P1722_순열의순서.main(null);
		
		//예제2
		String sInput2 = "4\n"
				   + "2 1 3 2 4\n";
		exInput(sInput2);
		P1722_순열의순서.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
