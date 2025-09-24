package chap04;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11660_구간합구하기2Test {

	@Test
	void testMain() throws Exception {
		
		//예제1
        exInput("4 3\n1 2 3 4\n2 3 4 5\n3 4 5 6\n4 5 6 7\n2 2 3 4\n3 4 3 4\n1 1 4 4");
        P11660_구간합구하기2.main(null);
        
		//예제2
        exInput("2 4\n1 2\n3 4\n1 1 1 1\n1 2 1 2\n2 1 2 1\n2 2 2 2");
        P11660_구간합구하기2.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
}
