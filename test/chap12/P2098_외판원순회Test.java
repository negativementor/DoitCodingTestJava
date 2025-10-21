package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2098_외판원순회Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "4\n"
					   + "0 10 15 20\n"
					   + "5 0 9 10\n"
					   + "6 13 0 12\n"
					   + "8 8 9 0\n";
		exInput(sInput1);
		P2098_외판원순회.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
}
