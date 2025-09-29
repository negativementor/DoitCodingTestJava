package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P9663_NQueenTest {

	@Test
	void testMain() {

        //예제1
        exInput("8");
        P9663_NQueen.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
