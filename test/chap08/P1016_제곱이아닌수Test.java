package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1016_제곱이아닌수Test {

	@Test
	void testMain() throws Exception {
		
		//예제1
		String sInput1 = "1 10\n";
		exInput(sInput1);
		P1016_제곱이아닌수.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
