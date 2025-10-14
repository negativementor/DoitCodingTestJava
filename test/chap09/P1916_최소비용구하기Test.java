package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1916_최소비용구하기Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "5\n"
					   + "8\n"
					   + "1 2 2\n"
					   + "1 3 3\n"
					   + "1 4 1\n"
					   + "1 5 10\n"
					   + "2 4 2\n"
					   + "3 4 1\n"
					   + "3 5 1\n"
					   + "4 5 3\n"
					   + "1 5\n";
		exInput(sInput1);
		P1916_최소비용구하기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
