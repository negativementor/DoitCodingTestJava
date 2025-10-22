package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11659_구간합구하기_수정Test {

	@Test
	void testMain() throws IOException {
		
		//예제1
		String sInput1 = "5 3\n"
					   + "5 4 3 2 1\n"
					   + "1 3\n"
					   + "2 4\n"
					   + "5 5\n";
		exInput(sInput1);
		P11659_구간합구하기_수정.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
