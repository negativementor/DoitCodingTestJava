package chap04;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P11720_숫자의합Test {

	@Test
	void testMain() {
		
        //예제1
        exInput("1\n1");
        P11720_숫자의합.main(null);
        
        //예제2
        exInput("5\n54321");
        P11720_숫자의합.main(null);

        //예제3
        exInput("25\n7000000000000000000000000");
        P11720_숫자의합.main(null);
        
        //예제4
        exInput("11\n10987654321");
        P11720_숫자의합.main(null);

	}
	
	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
