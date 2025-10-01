package chap08;
import java.util.*;
public class P1934_최소공배수_수정 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] R = new int[t];
    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int result = a * b / gcd(a, b);
      R[i] = result;
    }
    //결과출력
    for (int i = 0; i < t; i++) {
    	System.out.println(R[i]);
    }
  }
  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }
}