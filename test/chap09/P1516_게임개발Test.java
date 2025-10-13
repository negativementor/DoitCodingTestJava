package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1516_게임개발Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "5\n"
					   + "10 -1\n"
					   + "10 1 -1\n"
					   + "4 1 -1\n"
					   + "4 3 1 -1\n"
					   + "3 3 -1\n";
		exInput(sInput1);
		P1516_게임개발.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
