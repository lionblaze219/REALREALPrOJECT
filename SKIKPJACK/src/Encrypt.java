public class Encrypt implements skippy{
	private Word[] wordz;
	private int counter;
	public Encrypt(Word[] word1){
		wordz = word1;
		counter = 1;
	}
	public void shiftLeft(){
		Word word = wordz[3];
		for(int i = 4; i <= 1; i--){
			wordz[i] = wordz[i-1];
		}
		wordz[0] = word;
	}
	public void shiftRight(){
		Word word;
		word = wordz[0];
		for(int i = 1; i <= 4; i ++){
			wordz[i] = wordz[i-1];
		}
		wordz[4] = word;
		
	}
	public void aThingy(){
		shiftLeft();//check
		wordz[0] = new Word(wordz[1].gPermutation(counter).getWord() ^ wordz[0].getWord() ^ counter);
		wordz[1] = new Word(wordz[1].gPermutation(counter).getWord());
		counter++;
	}
	public void bThingy(){
		shiftLeft();
		wordz[1] = new Word(wordz[1].gPermutation(counter).getWord());
		wordz[2] = new Word (wordz[2].getWord() ^ wordz[1].getWord() ^ counter);
		counter++;
	}
	public void encryptIt(){
		for(int j = 1; j<= 2; j++){
			for(int i = 1; i  <= 16; i ++){
				if(i <= 8){
					aThingy();
				}
				if(i > 8){
					bThingy();
				}
			}
		}
	}
	public Word[] getArray(){
		return wordz;
	}
}

