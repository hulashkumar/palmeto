package regex;

import java.util.regex.Pattern;

public class UserMainCode {
	public static void validatePassword(String s) {
		
		String s1="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$]).{6,20})";
		System.out.println(s.matches(s1));
		
	}
}
