package chap03;

import java.util.Arrays;
import java.util.Collections;

public class CHAP03_5_2 {

	public static void main(String[] args) {
		
		// 내림차순 정렬1
		Integer[] A = {5, 3, 2, 4, 1};
		Arrays.sort(A, Collections.reverseOrder());
		System.out.println(Arrays.toString(A));

	}

}
