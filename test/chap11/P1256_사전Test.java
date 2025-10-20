package chap11;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1256_사전Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "2 2 2\n";
		exInput(sInput1);
		P1256_사전.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
