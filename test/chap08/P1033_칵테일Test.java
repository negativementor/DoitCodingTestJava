package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1033_칵테일Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "5\n"
					   + "4 0 1 1\n"
					   + "4 1 3 1\n"
					   + "4 2 5 1\n"
					   + "4 3 7 1\n";
		exInput(sInput1);
		P1033_칵테일.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
