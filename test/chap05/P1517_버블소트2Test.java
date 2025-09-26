package chap05;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1517_버블소트2Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("8\n3 2 8 1 7 4 5 6");
        P1517_버블소트2.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
