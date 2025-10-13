package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1948_임계경로Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "7\n"
					   + "9\n"
					   + "1 2 4\n"
					   + "1 3 2\n"
					   + "1 4 3\n"
					   + "2 6 3\n"
					   + "2 7 5\n"
					   + "3 5 1\n"
					   + "4 6 4\n"
					   + "5 6 2\n"
					   + "6 7 5\n"
					   + "1 7\n";
		exInput(sInput1);
		P1948_임계경로.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
