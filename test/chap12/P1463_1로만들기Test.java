package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1463_1로만들기Test {

	@Test
	void testMain() throws Exception {
		
		//예제1
		String sInput1 = "10\n";
		exInput(sInput1);
		P1463_1로만들기.main(null);
		
		//예제2
		String sInput2 = "2\n";
		exInput(sInput2);
		P1463_1로만들기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
