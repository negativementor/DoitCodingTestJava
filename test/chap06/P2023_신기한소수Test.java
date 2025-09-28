package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2023_신기한소수Test {

	@Test
	void testMain() {

        //예제1
        exInput("4");
        P2023_신기한소수.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
