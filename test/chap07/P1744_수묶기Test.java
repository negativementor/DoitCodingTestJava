package chap07;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1744_수묶기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "9\n"
					   + "-1\n"
					   + "-8\n"
					   + "2\n"
					   + "1\n"
					   + "3\n"
					   + "6\n"
					   + "-5\n"
					   + "0\n"
					   + "1\n";
		exInput(sInput1);
		P1744_수묶기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
