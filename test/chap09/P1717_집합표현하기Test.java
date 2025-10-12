package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1717_집합표현하기Test {

	@Test
	void testMain() {
		
		//예제1
		String sInput1 = "7 8\n"
					   + "0 1 3\n"
					   + "1 1 7\n"
					   + "0 7 6\n"
					   + "1 7 1\n"
					   + "0 3 7\n"
					   + "0 4 2\n"
					   + "0 1 1\n"
					   + "1 1 1\n";
		exInput(sInput1);
		P1717_집합표현하기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
