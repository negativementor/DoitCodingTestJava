package chap04;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1546_평균Test {

	@Test
	void testMain() {
		
        //예제1
        exInput("3\n40 80 60");
        P1546_평균.main(null);
        
        //예제2
        exInput("3\n10 20 30");
        P1546_평균.main(null);
        
        //예제3
        exInput("4\n1 100 100 100");
        P1546_평균.main(null);
        
        //예제4
        exInput("5\n1 2 4 8 16");
        P1546_평균.main(null);
        
        //예제5
        exInput("2\n3 10");
        P1546_평균.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}
}
