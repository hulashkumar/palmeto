package regex;

import java.util.regex.Pattern;

public class UserMainCode3 {
	public static void validate(String s) {
		String s1="(?=.*[0-9])(?=.*[@#$]).{6,20}";
		System.out.println(Pattern.matches(s1,s));	
	}
}
