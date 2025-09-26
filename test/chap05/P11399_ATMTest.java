package chap05;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11399_ATMTest {

	@Test
	void testMain() {

        //예제1
        exInput("5\n3 1 4 3 2");
        P11399_ATM.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
