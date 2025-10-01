package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1747_소수팰린드롬_수정Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "31\n";
		exInput(sInput1);
		P1747_소수팰린드롬_수정.main(null);
		
		//예제2
		String sInput2 = "9999000\n";
		exInput(sInput2);
		P1747_소수팰린드롬_수정.main(null);
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
