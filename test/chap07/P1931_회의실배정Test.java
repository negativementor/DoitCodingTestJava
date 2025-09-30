package chap07;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1931_회의실배정Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "11\n"
					   + "1 4\n"
					   + "3 5\n"
					   + "0 6\n"
					   + "5 7\n"
					   + "3 8\n"
					   + "5 9\n"
					   + "6 10\n"
					   + "8 11\n"
					   + "8 12\n"
					   + "2 13\n"
					   + "12 14\n";
		exInput(sInput1);
		P1931_회의실배정.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
