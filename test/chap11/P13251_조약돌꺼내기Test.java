package chap11;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P13251_조약돌꺼내기Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "3\n"
				   + "5 6 7\n"
				   + "2\n";
		exInput(sInput1);
		P13251_조약돌꺼내기.main(null);
		
		//예제2
		String sInput2 = "2\n"
				   + "5 7\n"
				   + "1\n";
		exInput(sInput2);
		P13251_조약돌꺼내기.main(null);
		
		//예제3
		String sInput3 = "1\n"
				   + "13\n"
				   + "8\n";
		exInput(sInput3);
		P13251_조약돌꺼내기.main(null);
		
		//예제4
		String sInput4 = "5\n"
				   + "12 2 34 13 17\n"
				   + "4\n";
		exInput(sInput4);
		P13251_조약돌꺼내기.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
