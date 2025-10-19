package chap10;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11725_트리의부모찾기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "7\n"
					   + "1 6\n"
					   + "6 3\n"
					   + "3 5\n"
					   + "4 1\n"
					   + "2 4\n"
					   + "4 7\n";
		exInput(sInput1);
		P11725_트리의부모찾기.main(null);
		
		//예제2
		String sInput2 = "12\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "2 4\n"
					   + "3 5\n"
					   + "3 6\n"
					   + "4 7\n"
					   + "4 8\n"
					   + "5 9\n"
					   + "5 10\n"
					   + "6 11\n"
					   + "6 12\n";
		exInput(sInput2);
		P11725_트리의부모찾기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
