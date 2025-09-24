package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11659_구간합구하기Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("5 3\n5 4 3 2 1\n1 3\n2 4\n5 5");
        P11659_구간합구하기.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
}
