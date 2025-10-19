package chap10;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P14425_문자열찾기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "5 11\n"
					   + "baekjoononlinejudge\n"
					   + "startlink\n"
					   + "codeplus\n"
					   + "sundaycoding\n"
					   + "codingsh\n"
					   + "baekjoon\n"
					   + "codeplus\n"
					   + "codeminus\n"
					   + "startlink\n"
					   + "starlink\n"
					   + "sundaycoding\n"
					   + "codingsh\n"
					   + "codinghs\n"
					   + "sondaycoding\n"
					   + "startrink\n"
					   + "icerink\n";
		exInput(sInput1);
		P14425_문자열찾기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
