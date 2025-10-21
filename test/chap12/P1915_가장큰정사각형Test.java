package chap12;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1915_가장큰정사각형Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "4 4\n"
					   + "0100\n"
					   + "0111\n"
					   + "1110\n"
					   + "0010\n";
		exInput(sInput1);
		P1915_가장큰정사각형.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
