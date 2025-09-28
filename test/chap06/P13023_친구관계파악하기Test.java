package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P13023_친구관계파악하기Test {

	@Test
	void testMain() {

        //예제1
        exInput("8 8\n1 7\n3 7\n4 7\n3 4\n4 6\n3 5\n0 4\n2 7");
        P13023_친구관계파악하기.main(null);
        
        //예제2
        exInput("5 5\n0 1\n1 2\n2 3\n3 0\n1 4");
        P13023_친구관계파악하기.main(null);
        
        //예제3
        exInput("6 5\n0 1\n0 2\n0 3\n0 4\n0 5");
        P13023_친구관계파악하기.main(null);
        
        //예제4
        exInput("5 4\n0 1\n1 2\n2 3\n3 4");
        P13023_친구관계파악하기.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
