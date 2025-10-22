package chap13;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P17387_선분교차Test {

	@Test
	void testMain() throws Exception {

		//예제1
		String sInput1 = "1 1 5 5\n"
					   + "1 5 5 1\n";
		exInput(sInput1);
		P17387_선분교차.main(null);
		
		//예제2
		String sInput2 = "1 1 5 5\n"
					   + "6 10 10 6\n";
		exInput(sInput2);
		P17387_선분교차.main(null);
		
		//예제3
		String sInput3 = "1 1 5 5\n"
					   + "5 5 1 1\n";
		exInput(sInput3);
		P17387_선분교차.main(null);
		
		//예제4
		String sInput4 = "1 1 5 5\n"
					   + "3 3 5 5\n";
		exInput(sInput4);
		P17387_선분교차.main(null);
		
		//예제5
		String sInput5 = "1 1 5 5\n"
					   + "3 3 1 3\n";
		exInput(sInput5);
		P17387_선분교차.main(null);
		
		//예제6
		String sInput6 = "1 1 5 5\n"
					   + "5 5 9 9\n";
		exInput(sInput6);
		P17387_선분교차.main(null);
		
		//예제7
		String sInput7 = "1 1 5 5\n"
					   + "6 6 9 9\n";
		exInput(sInput7);
		P17387_선분교차.main(null);
		
		//예제8
		String sInput8 = "1 1 5 5\n"
					   + "5 5 1 5\n";
		exInput(sInput8);
		P17387_선분교차.main(null);
		
		//예제9
		String sInput9 = "1 1 5 5\n"
					   + "6 6 1 5\n";
		exInput(sInput9);
		P17387_선분교차.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
