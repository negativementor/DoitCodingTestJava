package chap06;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P17136_색종이붙이기Test {

	@Test
	void testMain() throws IOException {

        //예제1
		String sInput1 = "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 1 1 0 0 0 0 0 0 0\n"
					   + "0 1 1 1 0 0 0 0 0 0\n"
					   + "0 0 1 1 1 1 1 0 0 0\n"
					   + "0 0 0 1 1 1 1 0 0 0\n"
					   + "0 0 0 0 1 1 1 0 0 0\n"
					   + "0 0 1 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n";
        exInput(sInput1);
        P17136_색종이붙이기.main(null);
        
    	P17136_색종이붙이기.result = Integer.MAX_VALUE;
    	
        //예제2
		String sInput2 = "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 1 1 0 0 0 0 0 0 0\n"
					   + "0 0 1 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 1 1 0 0 0 0\n"
					   + "0 0 0 0 0 1 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 0 1 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n"
					   + "0 0 0 0 0 0 0 0 0 0\n";
		 exInput(sInput2);
		 P17136_색종이붙이기.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
