package chap09;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P1219_세일즈맨의고민_수정Test {

	@Test
	void testMain() throws IOException {

		//예제1
		String sInput1 = "5 0 4 5\n"
					   + "0 1 10\n"
					   + "1 2 10\n"
					   + "2 3 10\n"
					   + "3 1 10\n"
					   + "2 4 10\n"
					   + "0 10 10 110 10\n";
		exInput(sInput1);
		P1219_세일즈맨의고민_수정.main(null);
		
		//예제2
		String sInput2 = "5 0 4 7\n"
					   + "0 1 13\n"
					   + "1 2 17\n"
					   + "2 4 20\n"
					   + "0 3 22\n"
					   + "1 3 4747\n"
					   + "2 0 10\n"
					   + "3 4 10\n"
					   + "0 0 0 0 0\n";
		exInput(sInput2);
		P1219_세일즈맨의고민_수정.main(null);
		
		//예제3
		String sInput3 = "3 0 2 3\n"
					   + "0 1 10\n"
					   + "1 0 10\n"
					   + "2 1 10\n"
					   + "1000 1000 47000\n";
		exInput(sInput3);
		P1219_세일즈맨의고민_수정.main(null);
		
		//예제4
		String sInput4 = "2 0 1 2\n"
					   + "0 1 1000\n"
					   + "1 1 10\n"
					   + "11 11\n";
		exInput(sInput4);
		P1219_세일즈맨의고민_수정.main(null);
		
		//예제5
		String sInput5 = "1 0 0 1\n"
					   + "0 0 10\n"
					   + "7\n";
		exInput(sInput5);
		P1219_세일즈맨의고민_수정.main(null);
		
		//예제6
		String sInput6 = "5 0 4 7\n"
					   + "0 1 13\n"
					   + "1 2 17\n"
					   + "2 4 20\n"
					   + "0 3 22\n"
					   + "1 3 4747\n"
					   + "2 0 10\n"
					   + "3 4 10\n"
					   + "8 10 20 1 100000\n";
		exInput(sInput6);
		P1219_세일즈맨의고민_수정.main(null);
		
	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
