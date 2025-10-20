package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P14501_퇴사Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "7\n"
					   + "3 10\n"
					   + "5 20\n"
					   + "1 10\n"
					   + "1 20\n"
					   + "2 15\n"
					   + "4 40\n"
					   + "2 200\n";
		exInput(sInput1);
		P14501_퇴사.main(null);
		
		//예제2
		String sInput2 = "10\n"
					   + "1 1\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "1 4\n"
					   + "1 5\n"
					   + "1 6\n"
					   + "1 7\n"
					   + "1 8\n"
					   + "1 9\n"
					   + "1 10\n";
		exInput(sInput2);
		P14501_퇴사.main(null);
		
		//예제3
		String sInput3 = "10\n"
					   + "5 10\n"
					   + "5 9\n"
					   + "5 8\n"
					   + "5 7\n"
					   + "5 6\n"
					   + "5 10\n"
					   + "5 9\n"
					   + "5 8\n"
					   + "5 7\n"
					   + "5 6\n";
		exInput(sInput3);
		P14501_퇴사.main(null);
		
		//예제4
		String sInput4 = "10\n"
					   + "5 50\n"
					   + "4 40\n"
					   + "3 30\n"
					   + "2 20\n"
					   + "1 10\n"
					   + "1 10\n"
					   + "2 20\n"
					   + "3 30\n"
					   + "4 40\n"
					   + "5 50\n";
		exInput(sInput4);
		P14501_퇴사.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
