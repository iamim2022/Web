package javaOh;

//220609.13:06
//자음여부 판별

public class Word_BestAnswer {
	private String letters;

	public static void main(String[] args) {
		Word_BestAnswer word = new Word_BestAnswer("Hello World");

		// for문으로 읽기
		for (int i = 0; i < word.letters.length(); i++) {
//			System.out.println(word.isVowel(i));			//if Vowel = true
			System.out.println(word.isConsonant(i));		//if Consonant = true
		}
	}

//	생성자
//	this.letters = new String letters;   가 축약된 것.
	public Word_BestAnswer(String letters) {
		this.letters = letters.toLowerCase();
	}

//	i번째 글자의 모음 여부  _ a,i,u,e,o
	public boolean isVowel(int i) {
		return "aiueo".contains(letters.substring(i, i + 1));
	}
	
//	i번째 글자가 자음인지 _ a,i,u,e,o 제외한 나머지 _ 기존 코드 재활용
	public boolean isConsonant(int i) {
		return !isVowel(i);
	}
}
