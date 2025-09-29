package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P2343_블루레이Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "9 3\n"
					   + "1 2 3 4 5 6 7 8 9\n";
		exInput(sInput1);
		P2343_블루레이.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
	
}
