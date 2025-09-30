package chap07;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1715_카드정렬하기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "3\n"
					   + "10\n"
					   + "20\n"
					   + "40\n";
		exInput(sInput1);
		P1715_카드정렬하기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
