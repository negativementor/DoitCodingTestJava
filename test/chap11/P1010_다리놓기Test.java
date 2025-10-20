package chap11;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1010_다리놓기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "3\n"
				   + "2 2\n"
				   + "1 5\n"
				   + "13 29\n";
		exInput(sInput1);
		P1010_다리놓기.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
