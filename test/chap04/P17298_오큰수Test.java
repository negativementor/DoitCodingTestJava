package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P17298_오큰수Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("4\n3 5 2 7");
        P17298_오큰수.main(null);
        
        //예제2
        exInput("4\n9 5 4 8");
        P17298_오큰수.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
