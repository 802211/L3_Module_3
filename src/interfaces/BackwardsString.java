package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String backwards = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			backwards += s.charAt(i);
		}

		// TODO Auto-generated method stub
		return backwards;
	}

}
