public class Word {
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(word.isVowel(i));
		}
	}
	
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
//	i번째 글자의 모음 여부  _ a,i,u,e,o
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("i")  || letters.substring(i, i + 1).equals("u")
				 || letters.substring(i, i + 1).equals("e")  || letters.substring(i, i + 1).equals("o");
	}	
}
