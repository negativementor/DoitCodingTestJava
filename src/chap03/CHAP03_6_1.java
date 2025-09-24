package chap03;

import java.util.ArrayList;
import java.util.Collections;

public class CHAP03_6_1 {

	public static void main(String[] args) {
		
		// 클라이언트 코드
		ArrayList<Score> myarr = new ArrayList<>();
		myarr.add(new Score(80, 100));
		myarr.add(new Score(100, 50));
		myarr.add(new Score(70, 100));
		myarr.add(new Score(80, 90));
		
		Collections.sort(myarr);
		for(Score s : myarr) {
			System.out.println(s.toString());
		}

	}

}
