package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P17472_다리만들기Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "7 8\n"
					   + "0 0 0 0 0 0 1 1\n"
					   + "1 1 0 0 0 0 1 1\n"
					   + "1 1 0 0 0 0 0 0\n"
					   + "1 1 0 0 0 1 1 0\n"
					   + "0 0 0 0 0 1 1 0\n"
					   + "0 0 0 0 0 0 0 0\n"
					   + "1 1 1 1 1 1 1 1\n";
		exInput(sInput1);
		P17472_다리만들기.main(null);
		
		//예제2
		String sInput2 = "7 8\n"
					   + "0 0 0 1 1 0 0 0\n"
					   + "0 0 0 1 1 0 0 0\n"
					   + "1 1 0 0 0 0 1 1\n"
					   + "1 1 0 0 0 0 1 1\n"
					   + "1 1 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0\n"
					   + "1 1 1 1 1 1 1 1\n";
		exInput(sInput2);
		P17472_다리만들기.main(null);
		
		//예제3
		String sInput3 = "7 8\n"
					   + "1 0 0 1 1 1 0 0\n"
					   + "0 0 1 0 0 0 1 1\n"
					   + "0 0 1 0 0 0 1 1\n"
					   + "0 0 1 1 1 0 0 0\n"
					   + "0 0 0 0 0 0 0 0\n"
					   + "0 1 1 1 0 0 0 0\n"
					   + "1 1 1 1 1 1 0 0\n";
		exInput(sInput3);
		P17472_다리만들기.main(null);
		
		//예제4
		String sInput4 = "7 7\n"
					   + "1 1 1 0 1 1 1\n"
					   + "1 1 1 0 1 1 1\n"
					   + "1 1 1 0 1 1 1\n"
					   + "0 0 0 0 0 0 0\n"
					   + "1 1 1 0 1 1 1\n"
					   + "1 1 1 0 1 1 1\n"
					   + "1 1 1 0 1 1 1\n";
		exInput(sInput4);
		P17472_다리만들기.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
