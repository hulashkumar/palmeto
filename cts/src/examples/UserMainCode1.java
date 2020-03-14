package examples;

public class UserMainCode1 {
	public static int countVowels(String str) {
		int count=0;
		for(int x=0;x<str.length();x++) {
			if(str.charAt(x)=='a' || str.charAt(x)=='e' || str.charAt(x)=='i'|| str.charAt(x)=='o'|| str.charAt(x)=='u') {
				count++;
		}
	}
	return count;
}
}
