package chap10;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1068_리프노드Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "9\n"
					   + "-1 0 0 2 2 4 4 6 6\n"
					   + "4\n";
		exInput(sInput1);
		P1068_리프노드.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
	
}
