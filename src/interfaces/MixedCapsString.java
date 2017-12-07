package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {

		String caps = "";

		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				char c = Character.toLowerCase(s.charAt(i));
				caps += c;
			} else {
				char c = Character.toUpperCase(s.charAt(i));
				caps += c;
			}

		}
		// TODO Auto-generated method stub
		return caps;
	}

}
