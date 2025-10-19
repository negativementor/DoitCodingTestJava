package chap10;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1991_트리순회Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "7\n"
					   + "A B C\n"
					   + "B D .\n"
					   + "C E F\n"
					   + "E . .\n"
					   + "F . G\n"
					   + "D . .\n"
					   + "G . .\n";
		exInput(sInput1);
		P1991_트리순회.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
