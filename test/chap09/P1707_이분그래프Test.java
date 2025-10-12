package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1707_이분그래프Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "2\n"
					   + "3 2\n"
					   + "1 3\n"
					   + "2 3\n"
					   + "4 4\n"
					   + "1 2\n"
					   + "2 3\n"
					   + "3 4\n"
					   + "4 2\n";
		exInput(sInput1);
		P1707_이분그래프.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
