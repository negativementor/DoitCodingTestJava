package chap03;

public class CHAP03_4_2 {

	public static void main(String[] args) {
		
		// 1부터 50까지 곱한 값을 10007로 나눈 나머지 구하기 - 수정
		long answer = 1;
		for(int i=1; i <= 50; i++) {
			answer = (answer * i) % 10007;
		}
		System.out.println(answer % 10007);

	}

}
