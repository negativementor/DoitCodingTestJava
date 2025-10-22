package chap13;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2162_선분그룹Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "3\n"
					   + "1 1 2 3\n"
					   + "2 1 0 0\n"
					   + "1 0 1 1\n";
		exInput(sInput1);
		P2162_선분그룹.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
