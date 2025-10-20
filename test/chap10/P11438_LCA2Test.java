package chap10;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11438_LCA2Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "15\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "2 4\n"
					   + "3 7\n"
					   + "6 2\n"
					   + "3 8\n"
					   + "4 9\n"
					   + "2 5\n"
					   + "5 11\n"
					   + "7 13\n"
					   + "10 4\n"
					   + "11 15\n"
					   + "12 5\n"
					   + "14 7\n"
					   + "6\n"
					   + "6 11\n"
					   + "10 9\n"
					   + "2 6\n"
					   + "7 6\n"
					   + "8 13\n"
					   + "8 15\n";
		exInput(sInput1);
		P11437_LCA.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
