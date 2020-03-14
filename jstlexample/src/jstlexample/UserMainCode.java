package jstlexample;

public class UserMainCode {
	public static int checkUnique(String s){
		int n=s.length(),count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(s.charAt(i)!=s.charAt(j))
					count++;
				break;
			}
		}
		return count;
	}
}
