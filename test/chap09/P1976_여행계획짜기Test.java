package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1976_여행계획짜기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "3\n"
					   + "3\n"
					   + "0 1 0\n"
					   + "1 0 1\n"
					   + "0 1 0\n"
					   + "1 2 3\n";
		exInput(sInput1);
		P1976_여행계획짜기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
