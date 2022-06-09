package javaOh;

//220609.13:06
//자음여부 판별

public class Word_answer {
	private String letters;

	public static void main(String[] args) {
		Word_answer word = new Word_answer("Hello World");

		// for문으로 읽기
		for (int i = 0; i < word.letters.length(); i++) {
			System.out.println(word.isConsonant(i));
		}
	}

//	생성자
//	this.letters = new String letters;   가 축약된 것.
	public Word_answer(String letters) {
		this.letters = letters.toLowerCase();
	}

//	i번째 글자가 자음인지 _ a,i,u,e,o 제외한 나머지
	public boolean isConsonant(int i) {
		return !"aiueo".contains(letters.substring(i, i + 1));
	}
}
