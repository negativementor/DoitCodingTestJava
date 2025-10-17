package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1197_최소신장트리Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "3 3\n"
					   + "1 2 1\n"
					   + "2 3 2\n"
					   + "1 3 3\n";
		exInput(sInput1);
		P1197_최소신장트리.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
