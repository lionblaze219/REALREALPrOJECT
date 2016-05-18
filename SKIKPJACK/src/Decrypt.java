public class Decrypt implements skippy{
	private Word[] wordz;
	private int counter;
	public Decrypt(Word[] word1){
		wordz = word1;
		counter = 1;
	}
	public void shiftLeft(){
		Word word = wordz[4];
		for(int i = 4; i <= 1; i--){
			wordz[i] = wordz[i-1];
		}
		wordz[0] = word;
	}
	public void shiftRight(){
		Word word = wordz[0];
		for(int i = 1; i < 4; i ++){
			wordz[i] = wordz[i-1];
		}
		wordz[3] = word;
	}
	public void aThingy(){
		shiftRight();//check
		wordz[3] = new Word(wordz[3].getWord() ^ wordz[1].getWord() ^ counter);
		wordz[0] = new Word(wordz[0].invGPermutation(counter).getWord());
		counter++;
	}
	public void bThingy(){
		shiftRight();
		wordz[0] = new Word(wordz[0].invGPermutation(counter).getWord());
		wordz[1] = new Word(wordz[0].getWord() ^ wordz[1].getWord() ^ counter);
		counter++;
	}
	public void decryptIt(){
		for(int j = 1; j<= 2; j++){
			for(int i = 1; i  <= 16; i ++){
				if(i <= 8){
					bThingy();
				}
				if(i > 8){
					aThingy();
				}
			}
		}
	}
	public Word[] getArray(){
		return wordz;
	}

}
