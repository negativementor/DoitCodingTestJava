package chap03;

public class Score implements Comparable<Score> {

	// Comparable을 이용한 다중 조건 정렬
	int english;
	int math;
	
	public Score(int english, int math) {
		this.english = english;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score{" + "english=" + english + ", math=" + math + "}";
	}
	
	@Override
	public int compareTo(Score o) {
		if(this.english == o.english) return o.math - this.math;
		return o.english - this.english;
	}


	
	
}
