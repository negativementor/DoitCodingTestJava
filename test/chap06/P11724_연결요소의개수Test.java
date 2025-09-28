package chap06;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11724_연결요소의개수Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("6 5\n1 2\n2 5\n5 1\n3 4\n4 6");
        P11724_연결요소의개수.main(null);
        
        //예제2
        exInput("6 8\n1 2\n2 5\n5 1\n3 4\n4 6\n5 4\n2 4\n2 3");
        P11724_연결요소의개수.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
