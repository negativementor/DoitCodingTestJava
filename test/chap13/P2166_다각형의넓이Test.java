package chap13;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2166_다각형의넓이Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "4\n"
					   + "0 0\n"
					   + "0 10\n"
					   + "10 10\n"
					   + "10 0\n";
		exInput(sInput1);
		P2166_다각형의넓이.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
