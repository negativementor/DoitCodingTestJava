package chap05;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P2751_수정렬하기2Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("5\n5\n4\n3\n2\n1");
        P2751_수정렬하기2.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
