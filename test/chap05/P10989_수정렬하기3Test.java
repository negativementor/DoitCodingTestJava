package chap05;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class P10989_수정렬하기3Test {

	@Test
	void testMain() throws IOException {

        //예제1
        exInput("11\n215\n15\n344\n372\n294\n100\n8\n145\n24\n198\n831");
        P10989_수정렬하기3.main(null);
        
	}

	void exInput(String input) {
		System.out.println("\n===입력===");
		System.out.println(input);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        System.out.println("===출력===");
	}

}
