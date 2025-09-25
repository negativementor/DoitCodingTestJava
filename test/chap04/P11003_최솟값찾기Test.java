package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11003_최솟값찾기Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("12 3\n1 5 2 3 6 2 3 7 3 5 2 6");
        P11003_최솟값찾기.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
