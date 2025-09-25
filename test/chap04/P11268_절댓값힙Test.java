package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P11268_절댓값힙Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("18\n1\n-1\n0\n0\n0\n1\n1\n-1\n-1\n2\n-2\n0\n0\n0\n0\n0\n0\n0");
        P11268_절댓값힙.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
	
}
