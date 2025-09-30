package chap07;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1541_잃어버린괄호Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "100-40+50+74-30+29-45+43+11\n";
		exInput(sInput1);
		P1541_잃어버린괄호.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
