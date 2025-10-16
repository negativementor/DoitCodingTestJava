package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1854_K번째최단경로찾기Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5 10 2\n"
					   + "1 2 2\n"
					   + "1 3 7\n"
					   + "1 4 5\n"
					   + "1 5 6\n"
					   + "2 4 2\n"
					   + "2 3 4\n"
					   + "3 4 6\n"
					   + "3 5 8\n"
					   + "5 2 4\n"
					   + "5 4 1\n";
		exInput(sInput1);
		P1854_K번째최단경로찾기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
