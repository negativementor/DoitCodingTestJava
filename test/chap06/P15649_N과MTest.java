package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P15649_N과MTest {

	@Test
	void testMain() {

        //예제1
        exInput("3 1");
        P15649_N과M.main(null);
        
        //예제2
        exInput("4 4");
        P15649_N과M.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
