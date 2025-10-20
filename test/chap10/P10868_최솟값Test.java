package chap10;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P10868_최솟값Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "10 4\n"
					   + "75\n"
					   + "30\n"
					   + "100\n"
					   + "38\n"
					   + "50\n"
					   + "51\n"
					   + "52\n"
					   + "20\n"
					   + "81\n"
					   + "5\n"
					   + "1 10\n"
					   + "3 5\n"
					   + "6 9\n"
					   + "8 10\n";
		exInput(sInput1);
		P10868_최솟값.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
