package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1325_효율적인해킹Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5 4\n"
					   + "3 1\n"
					   + "3 2\n"
					   + "4 3\n"
					   + "5 3\n";
		exInput(sInput1);
		P1325_효율적인해킹.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
