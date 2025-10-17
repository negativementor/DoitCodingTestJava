package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11404_플로이드Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5\n"
					   + "14\n"
					   + "1 2 2\n"
					   + "1 3 3\n"
					   + "1 4 1\n"
					   + "1 5 10\n"
					   + "2 4 2\n"
					   + "3 4 1\n"
					   + "3 5 1\n"
					   + "4 5 3\n"
					   + "3 5 10\n"
					   + "3 1 8\n"
					   + "1 4 2\n"
					   + "5 1 7\n"
					   + "3 4 2\n"
					   + "5 2 4\n";
		exInput(sInput1);
		P11404_플로이드.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
