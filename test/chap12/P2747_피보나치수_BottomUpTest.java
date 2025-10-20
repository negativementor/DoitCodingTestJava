package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2747_피보나치수_BottomUpTest {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "7\n";
		exInput(sInput1);
		P2747_피보나치수_BottomUp.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
