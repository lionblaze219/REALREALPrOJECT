
public class Encrypt implements skippy{
	private Word[] wordz;
	private int counter;
	public Encrypt(Word[] word1){
		wordz = word1;
		counter = 1;
	}
	public void shiftLeft(){
		Word word = new Word();
		word = wordz[4];
		for(int i = 4; i <= 1; i--){
			wordz[i] = wordz[i-1];
		}
		wordz[0] = word;
	}
	public void shiftRight(){
		Word word = new Word();
		word = wordz[0];
		for(int i = 1; i <= 4; i ++){
			wordz[i] = wordz[i-1];
		}
		wordz[4] = word;
		
	}
	public void aThingy(){
		shiftLeft();//check
		wordz[0] = wordz[1].gPermutation() ^ wordz[0] ^ counter;
		wordz[1] = wordz[1].gPermutation();
		counter++;
	}
	public void bThingy(){
		shiftLeft();
		wordz[1] = wordz[1].gPermutation();
		wordz[2] = wordz[2] ^ wordz[1] ^ counter;
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
