package chap13;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11758_CCWTest {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "1 1\n"
					   + "5 5\n"
					   + "7 3\n";
		exInput(sInput1);
		P11758_CCW.main(null);
		
		//예제2
		String sInput2 = "1 1\n"
					   + "3 3\n"
					   + "5 5\n";
		exInput(sInput2);
		P11758_CCW.main(null);
		
		//예제3
		String sInput3 = "1 1\n"
					   + "7 3\n"
					   + "5 5\n";
		exInput(sInput3);
		P11758_CCW.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
