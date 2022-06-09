public class Word {
	private String letters;

	public static void main(String[] args) {
		Word word = new Word("Hello World");

		// for문으로 읽기
		for (int i = 0; i < word.letters.length(); i++) {
			System.out.println(word.isVowel(i));
		}
	}

//	생성자
//	this.letters = new String letters;   가 축약된 것.
	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

//	i번째 글자의 모음 여부  _ a,i,u,e,o
	public boolean isVowel(int i) {
		String[] vowel = { "a", "i", "u", "e", "o" };
		for (int j = 0; j < vowel.length; j++) {
			if (letters.substring(i, i + 1).equals(vowel[j])) {
				return true;
			}
		}
		return false;
	}
}