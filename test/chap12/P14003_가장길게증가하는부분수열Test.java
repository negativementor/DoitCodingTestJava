package chap12;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P14003_가장길게증가하는부분수열Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "10\n"
					   + "11 5 10 12 7 14 3 8 24 2\n";
		exInput(sInput1);
		P14003_가장길게증가하는부분수열.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
