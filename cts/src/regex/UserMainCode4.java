package regex;

import java.util.regex.Pattern;

public class UserMainCode4 {
	public static void validate(String s) {
		//String s1="(?=.*[PRO,FIN,Test]{1})(?=.*[a-zA-Z]{4})(?=.*[0-9]{3})";
		String s1="[P][R][O]([a-zA-Z]{4})([0-9]{3})";
		String s2="[F][I][N]([a-zA-Z]{4})([0-9]{3})";
		String s3="[T][e][s][t]([a-zA-Z]{4})([0-9]{3})";
		if(Pattern.matches(s1, s) || Pattern.matches(s2,s) || Pattern.matches(s3,s)) {
		System.out.println("True");}
		else {
			System.out.println("False");
		}
	}
	public static void hexadecimal(String s) {
		String s1="[#]([0-9A-F]{6})";
		System.out.println(Pattern.matches(s1, s));
	}
}