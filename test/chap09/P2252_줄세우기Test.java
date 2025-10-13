package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2252_줄세우기Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "4 2\n"
					   + "4 2\n"
					   + "3 1\n";
		exInput(sInput1);
		P2252_줄세우기.main(null);
		
		//예제2
		String sInput2 = "3 2\n"
					   + "1 3\n"
					   + "2 3\n";
		exInput(sInput2);
		P2252_줄세우기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
