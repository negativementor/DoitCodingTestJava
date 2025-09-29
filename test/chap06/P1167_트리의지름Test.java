package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1167_트리의지름Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "5\n"
					   + "1 3 2 -1\n"
					   + "2 4 4 -1\n"
					   + "3 1 2 4 3 -1\n"
					   + "4 2 4 3 3 5 6 -1\n"
					   + "5 4 6 -1\n";
		exInput(sInput1);
		P1167_트리의지름.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
