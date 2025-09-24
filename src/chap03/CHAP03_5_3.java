package chap03;

import java.util.Arrays;

public class CHAP03_5_3 {

	public static void main(String[] args) {
		
		// 내림차순 정렬2
		int[] A = {5, 3, 2, 4, 1};
		negate(A);
		Arrays.sort(A);
		negate(A);
		System.out.println(Arrays.toString(A));

	}
	
	static void negate(int[] temp) {
		for(int i=0; i < temp.length; i++) {
			temp[i] *= -1;
		}
	}

}
