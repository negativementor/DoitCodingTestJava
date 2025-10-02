package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P21568_AxByCTest {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "1 2 3\n";
		exInput(sInput1);
		P21568_AxByC.main(null);
		
		//예제2
		String sInput2 = "3 4 5\n";
		exInput(sInput2);
		P21568_AxByC.main(null);
		
		//예제3
		String sInput3 = "6 8 3\n";
		exInput(sInput3);
		P21568_AxByC.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
