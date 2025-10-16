package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11657_타임머신_수정Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "3 4\n"
					   + "1 2 4\n"
					   + "1 3 3\n"
					   + "2 3 -4\n"
					   + "3 1 -2\n";
		exInput(sInput1);
		P11657_타임머신_수정.main(null);
		
		//예제2
		String sInput2 = "3 2\n"
					   + "1 2 4\n"
					   + "1 2 3\n";
		exInput(sInput2);
		P11657_타임머신_수정.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
