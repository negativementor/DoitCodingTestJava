package chap05;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2750_수정렬하기Test {

	@Test
	void testMain() {

        //예제1
        exInput("5\n5\n2\n3\n4\n1");
        P2750_수정렬하기.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
