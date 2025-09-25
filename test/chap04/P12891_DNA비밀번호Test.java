package chap04;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P12891_DNA비밀번호Test {

	@Test
	void testMain() throws NumberFormatException, IOException {

        //예제1
        exInput("9 8\nCCTGGATTG\n2 0 1 1");
        P12891_DNA비밀번호.main(null);
        
        //예제2
        exInput("4 2\nGATA\n1 0 0 1");
        P12891_DNA비밀번호.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
