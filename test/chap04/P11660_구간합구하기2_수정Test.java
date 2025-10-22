package chap04;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11660_구간합구하기2_수정Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "4 3\n"
					   + "1 2 3 4\n"
					   + "2 3 4 5\n"
					   + "3 4 5 6\n"
					   + "4 5 6 7\n"
					   + "2 2 3 4\n"
					   + "3 4 3 4\n"
					   + "1 1 4 4\n";
		exInput(sInput1);
		P11660_구간합구하기2_수정.main(null);
		
		//예제2
		String sInput2 = "2 4\n"
					   + "1 2\n"
					   + "3 4\n"
					   + "1 1 1 1\n"
					   + "1 2 1 2\n"
					   + "2 1 2 1\n"
					   + "2 2 2 2\n";
		exInput(sInput2);
		P11660_구간합구하기2_수정.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
