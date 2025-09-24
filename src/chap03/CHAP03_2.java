package chap03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CHAP03_2 {

	public static void main(String[] args) throws IOException {
		
		// Scanner와 System.out.print VS BufferedReader와 BufferedWriter
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int b = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(b));
		bw.flush();

	}

}
