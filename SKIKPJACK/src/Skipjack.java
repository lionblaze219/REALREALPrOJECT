public class Skipjack {

	public Skipjack(){
		
	}
	public static void main(String args[]){

		Word[] word = new Word[4];
		word[0] = new Word((byte)00000000, (byte)00000000);
		word[1] = new Word((byte)00000000, (byte)00000000);
		word[2] = new Word((byte)00000000, (byte)00000000);
		word[3] = new Word((byte)00000000, (byte)00000000);
		Encrypt encryption = new Encrypt(word);
		encryption.encryptIt();
		encryption.getArray();
		System.out.println(encryption.getArray());
		
		Decrypt decryption = new Decrypt(word);
		decryption.getArray();
		decryption.decryptIt();
		System.out.println(decryption.getArray());
		
	}
}
