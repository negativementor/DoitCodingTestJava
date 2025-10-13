package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1043_거짓말Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "4 3\n"
					   + "0\n"
					   + "2 1 2\n"
					   + "1 3\n"
					   + "3 2 3 4\n";
		exInput(sInput1);
		P1043_거짓말.main(null);
		
		//예제2
		String sInput2 = "4 1\n"
					   + "1 1\n"
					   + "4 1 2 3 4\n";
		exInput(sInput2);
		P1043_거짓말.main(null);
		
		//예제3
		String sInput3 = "4 1\n"
					   + "0\n"
					   + "4 1 2 3 4\n";
		exInput(sInput3);
		P1043_거짓말.main(null);
		
		//예제4
		String sInput4 = "4 5\n"
					   + "1 1\n"
					   + "1 1\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "1 4\n"
					   + "2 4 1\n";
		exInput(sInput4);
		P1043_거짓말.main(null);
		
		//예제5
		String sInput5 = "10 9\n"
					   + "4 1 2 3 4\n"
					   + "2 1 5\n"
					   + "2 2 6\n"
					   + "1 7\n"
					   + "1 8\n"
					   + "2 7 8\n"
					   + "1 9\n"
					   + "1 10\n"
					   + "2 3 10\n"
					   + "1 4\n";
		exInput(sInput5);
		P1043_거짓말.main(null);
		
		//예제6
		String sInput6 = "8 5\n"
					   + "3 1 2 7\n"
					   + "2 3 4\n"
					   + "1 5\n"
					   + "2 5 6\n"
					   + "2 6 8\n"
					   + "1 8\n";
		exInput(sInput6);
		P1043_거짓말.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
