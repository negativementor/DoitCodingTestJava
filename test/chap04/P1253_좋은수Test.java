package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1253_좋은수Test {

	@Test
	void testMain() throws NumberFormatException, IOException {

        //예제1
        exInput("10\n1 2 3 4 5 6 7 8 9 10");
        P1253_좋은수.main(null);
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
}
