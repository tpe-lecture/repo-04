package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		input = input.toLowerCase();
		String crypt = "";
		for (int i = 0; i < input.length(); i++) {

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

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		String decrypt = "";
		if (input.toLowerCase().equals(input)) {

			for (int i = 0; i < input.length(); i++) {

				switch (input.charAt(i)) {
				case '&':
					throw new IllegalArgumentException("Keine Sonderzeichen!");
				case '/':
					throw new IllegalArgumentException("Keine Sonderzeichen!");
				case ')':
					throw new IllegalArgumentException("Keine Sonderzeichen!");
				case '!':
					throw new IllegalArgumentException("Keine Sonderzeichen!");
				case '?':
					throw new IllegalArgumentException("Keine Sonderzeichen!");
				case '^':
					throw new IllegalArgumentException("Keine Sonderzeichen!");
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
			}
		} 
		else {
			throw new IllegalArgumentException("Keine Sonderzeichen!");
		}
		return decrypt;
	}

}