package chap06;

import java.util.Scanner;

public class P15649_N과M {
	static int N, M;
	static boolean[] V;						// 숫자 사용 여부 저장하기
	static int[] S;							// 수열 정보 저장하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		S = new int[N];
		V = new boolean[N];
		backtracking(0);
	}
	
	private static void backtracking(int length) {
		if (length == M) {					// 길이가 M인 수열이 만들어진 경우
			printArray();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!V[i]) {
				V[i] = true;				// 수 사용 저장하기
				S[length] = i;				// 수열에 수 저장하기
				backtracking(length + 1);
				V[i] = false;				// 수 반납 저장하기
			}
		}
	}
	
	private static void printArray() {		// 수열 내용 출력하기
		for(int i = 0; i < M; i++) {
			System.out.print(S[i] + 1 + " ");
		}
		System.out.println();
	}

}
