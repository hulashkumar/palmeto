package regex;

import java.util.regex.Pattern;

public class CharacterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//true
			System.out.println(Pattern.matches("[xyz]{3}","xyz"));
			//false
			System.out.println(Pattern.matches("[^xyz]","x"));
			//false
			System.out.println(Pattern.matches("[xyz]","xxyyyyz"));
			System.out.println("-----------MetacharExample------------");
			System.out.println(Pattern.matches("d","abc"));
			System.out.println(Pattern.matches("d","1"));
			System.out.println(Pattern.matches("d","4443"));
			System.out.println(Pattern.matches("\\d","323abc"));
			System.out.println("*******metacharacter D**********");
			System.out.println(Pattern.matches("D","abc"));
			System.out.println(Pattern.matches("D","1"));
			System.out.println(Pattern.matches("D","4443"));
			System.out.println(Pattern.matches("D","323abc"));
	}

}
