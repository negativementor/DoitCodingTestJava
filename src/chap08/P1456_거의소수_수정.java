package chap08;
import java.util.Scanner;
public class P1456_거의소수_수정 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long Min = sc.nextLong();
    long Max = sc.nextLong();
    long[] A = new long[(int)Math.sqrt(Max) + 1];
    for (int i = 2; i < A.length; i++) {
      A[i] = i;
    }
    for (int i = 2; i <= Math.sqrt(A.length); i++) { // 제곱근 까지만 수행
      if (A[i] == 0) {
        continue;
      }
      for (int j = i + i; j < A.length; j = j + i) { // 배수 지우기
        A[j] = 0;
      }
    }
    int count = 0;
    for (int i = 2; i < A.length; i++) {
      if (A[i] != 0) {
        long temp = A[i];
        while ((double)A[i] <= (double)Max/(double)temp) {
          if ((double)A[i] >= (double)Min/(double)temp ) {
            count++;
          }
          temp = temp * A[i];
        }
      }
    }
    System.out.println(count);
  }
}
