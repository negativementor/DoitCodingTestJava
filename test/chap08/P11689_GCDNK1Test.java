package chap08;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11689_GCDNK1Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "1\n";
		exInput(sInput1);
		P11689_GCDNK1.main(null);
		
		//예제2
		String sInput2 = "5\n";
		exInput(sInput2);
		P11689_GCDNK1.main(null);
		
		//예제3
		String sInput3 = "10\n";
		exInput(sInput3);
		P11689_GCDNK1.main(null);
		
		//예제4
		String sInput4 = "45\n";
		exInput(sInput4);
		P11689_GCDNK1.main(null);
		
		//예제5
		String sInput5 = "99\n";
		exInput(sInput5);
		P11689_GCDNK1.main(null);
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
