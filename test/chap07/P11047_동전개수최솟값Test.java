package chap07;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11047_동전개수최솟값Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "10 4200\n"
					   + "1\n"
					   + "5\n"
					   + "10\n"
					   + "50\n"
					   + "100\n"
					   + "500\n"
					   + "1000\n"
					   + "5000\n"
					   + "10000\n"
					   + "50000\n";
		exInput(sInput1);
		P11047_동전개수최솟값.main(null);
		
		//예제2
		String sInput2 = "10 4790\n"
					   + "1\n"
					   + "5\n"
					   + "10\n"
					   + "50\n"
					   + "100\n"
					   + "500\n"
					   + "1000\n"
					   + "5000\n"
					   + "10000\n"
					   + "50000\n";
		exInput(sInput2);
		P11047_동전개수최솟값.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
