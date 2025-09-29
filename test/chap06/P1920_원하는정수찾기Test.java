package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1920_원하는정수찾기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "5\n"
					   + "4 1 5 2 3\n"
					   + "5\n"
					   + "1 3 7 9 5\n";
		exInput(sInput1);
		P1920_원하는정수찾기.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
