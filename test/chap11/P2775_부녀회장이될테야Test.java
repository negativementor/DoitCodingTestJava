package chap11;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2775_부녀회장이될테야Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "2\n"
				   + "1\n"
				   + "3\n"
				   + "2\n"
				   + "3\n";
		exInput(sInput1);
		P2775_부녀회장이될테야.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
