package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1456_거의소수_수정Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "1 1000\n";
		exInput(sInput1);
		P1456_거의소수_수정.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
