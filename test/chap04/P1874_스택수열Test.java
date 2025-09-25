package chap04;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1874_스택수열Test {

	@Test
	void testMain() {

        //예제1
        exInput("8\n4\n3\n6\n8\n7\n5\n2\n1");
        P1874_스택수열.main(null);
        
        //예제2
        exInput("5\n1\n2\n5\n3\n4");
        P1874_스택수열.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
