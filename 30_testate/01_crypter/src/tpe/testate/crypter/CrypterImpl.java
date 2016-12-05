package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	/**
	 * method to encrypt the input string
	 *
	 * @parameter input : the string varriable that is encrypted
	 * @return the encrypted string
	 * @throws
	 */
	public String encrypt(String input) {
		input = input.toLowerCase();
		String crypt = "";
		for (int i = 0; i < input.length(); i++) {

			//switch-case for various characters
			switch (input.charAt(i)) {
			case 'e':
				crypt = crypt + "3";
				break;
			case '3':
				crypt = crypt + "e";
				break;
			case 'l':
				crypt = crypt + "1";
				break;
			case '1':
				crypt = crypt + "l";
				break;
			case 'o':
				crypt = crypt + "0";
				break;
			case '0':
				crypt = crypt + "o";
				break;
			case 'a':
				crypt = crypt + "4";
				break;
			case '4':
				crypt = crypt + "a";
				break;
			case 't':
				crypt = crypt + "7";
				break;
			case '7':
				crypt = crypt + "t";
				break;
			default:
				crypt = crypt + input.charAt(i);
				break;

			}

		}
		return crypt;
	}

	/**
	 * method to decrypt the input string
	 * @param input : the string variable that should be decrypted
	 * @return Strng : return the decrypted input
	 * @throws IllegalArgumentException : if an invalid character is used
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		String decrypt = "";
		if (input.toLowerCase().equals(input)) {

			for (int i = 0; i < input.length(); i++) {

				//condition to sort wrong characters
				if ((input.charAt(i) > 96 && input.charAt(i) < 123) || (input.charAt(i) > 47 && input.charAt(i) < 58)
						|| input.charAt(i) == 32) {

					//switch-case for various characters
					switch (input.charAt(i)) {
					case 'e':
						decrypt = decrypt + "3";
						break;
					case '3':
						decrypt = decrypt + "e";
						break;
					case 'l':
						decrypt = decrypt + "1";
						break;
					case '1':
						decrypt = decrypt + "l";
						break;
					case 'o':
						decrypt = decrypt + "0";
						break;
					case '0':
						decrypt = decrypt + "o";
						break;
					case 'a':
						decrypt = decrypt + "4";
						break;
					case '4':
						decrypt = decrypt + "a";
						break;
					case 't':
						decrypt = decrypt + "7";
						break;
					case '7':
						decrypt = decrypt + "t";
						break;
					default:
						decrypt = decrypt + input.charAt(i);
						break;

					}
				} else {
					throw new IllegalArgumentException("Keine Sonderzeichen");
				}

			}

		} else {
			throw new IllegalArgumentException("Keine Sonderzeichen");
		}
		return decrypt;
	}
}