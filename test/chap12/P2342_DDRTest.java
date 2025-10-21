package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2342_DDRTest {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "1 2 2 4 0\n";
		exInput(sInput1);
		P2342_DDR.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
