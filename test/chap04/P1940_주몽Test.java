package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1940_주몽Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("6\n9\n2 7 4 1 5 3");
        P1940_주몽.main(null);
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
