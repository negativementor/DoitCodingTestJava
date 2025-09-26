package chap05;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1377_버블소트1Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("5\n10\n1\n5\n2\n3");
        P1377_버블소트1.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
