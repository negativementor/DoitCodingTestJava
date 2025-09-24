package chap04;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2018_연속된자연수의합Test {

	@Test
	void testMain() {

		//예제1
        exInput("15");
        P2018_연속된자연수의합.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
