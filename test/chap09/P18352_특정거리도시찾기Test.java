package chap09;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P18352_특정거리도시찾기Test {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "4 4 2 1\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "2 3\n"
					   + "2 4\n";
		exInput(sInput1);
		P18352_특정거리도시찾기.main(null);
		
		//예제2
		String sInput2 = "4 3 2 1\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "1 4\n";
		exInput(sInput2);
		P18352_특정거리도시찾기.main(null);
		
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
