package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1753_최단경로Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5 6\n"
					   + "1\n"
					   + "5 1 1\n"
					   + "1 2 2\n"
					   + "1 3 3\n"
					   + "2 3 4\n"
					   + "2 4 5\n"
					   + "3 4 6\n";
		exInput(sInput1);
		P1753_최단경로.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
