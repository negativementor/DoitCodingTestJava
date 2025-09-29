package chap06;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P2178_미로탐색Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "4 6\n"
					   + "101111\n"
					   + "101010\n"
					   + "101011\n"
					   + "111011\n";
		exInput(sInput1);
		P2178_미로탐색.main(null);
        
		//예제2
		String sInput2 = "4 6\n"
					   + "110110\n"
					   + "110110\n"
					   + "111111\n"
					   + "111101\n";
		exInput(sInput2);
		P2178_미로탐색.main(null);
		
		//예제3
		String sInput3 = "2 25\n"
					   + "1011101110111011101110111\n"
					   + "1110111011101110111011101\n";
		exInput(sInput3);
		P2178_미로탐색.main(null);
		
		//예제4
		String sInput4 = "7 7\n"
					   + "1011111\n"
					   + "1110001\n"
					   + "1000001\n"
					   + "1000001\n"
					   + "1000001\n"
					   + "1000001\n"
					   + "1111111\n";
		exInput(sInput4);
		P2178_미로탐색.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
