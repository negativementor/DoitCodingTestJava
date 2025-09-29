package chap06;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class P1260_DFS와BFSTest {

	@Test
	void testMain() {

		//예제1
		String sInput1 = "4 5 1\n"
					   + "1 2\n"
					   + "1 3\n"
					   + "1 4\n"
					   + "2 4\n"
					   + "3 4\n";
		exInput(sInput1);
		P1260_DFS와BFS.main(null);
        
        //예제2
		String sInput2 = "5 5 3\n"
					   + "5 4\n"
					   + "5 2\n"
					   + "1 2\n"
					   + "3 4\n"
					   + "3 1\n";
		exInput(sInput2);
		P1260_DFS와BFS.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
