package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P9252_LCSTest {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "ACAYKP\n"
					   + "CAPCAK\n";
		exInput(sInput1);
		P9252_LCS.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
