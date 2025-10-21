package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P10844_계단수Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "1\n";
		exInput(sInput1);
		P10844_계단수.main(null);
		
		//예제2
		String sInput2 = "2\n";
		exInput(sInput2);
		P10844_계단수.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
