package obj_array;

public class Score {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int total;
	private int avg;
	
	public Score(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = korean + english + math;
		this.avg = (korean + english + math)/3;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	void scoreInfo() {
		System.out.printf("이름: %s\n국어 점수: %d\n영어 점수: %d\n수학 점수: %d\n총점: %d\n평균: %d\n",
				this.name, this.korean, this.english, this.math,
				this.total, this.avg);
	}
}
