package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1934_최소공배수_수정Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "3\n"
					   + "1 45000\n"
					   + "6 10\n"
					   + "13 17\n";
		exInput(sInput1);
		P1934_최소공배수_수정.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
