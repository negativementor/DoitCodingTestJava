package chap10;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11505_구간곱구하기Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5 2 2\n"
					   + "1\n"
					   + "2\n"
					   + "3\n"
					   + "4\n"
					   + "5\n"
					   + "1 3 6\n"
					   + "2 2 5\n"
					   + "1 5 2\n"
					   + "2 3 5\n";
		exInput(sInput1);
		P11505_구간곱구하기.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
