package chap12;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11049_행렬곱연산횟수의최솟값Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "3\n"
					   + "5 3\n"
					   + "3 2\n"
					   + "2 6\n";
		exInput(sInput1);
		P11049_행렬곱연산횟수의최솟값.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
