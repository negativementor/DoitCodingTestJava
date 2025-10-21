package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1328_빌딩Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "3 2 2\n";
		exInput(sInput1);
		P1328_빌딩.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
