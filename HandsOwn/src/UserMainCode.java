
public class UserMainCode {
	public static String getString(String s) {
		StringBuffer sb=new StringBuffer();
		char a=s.charAt(0);
		char b=s.charAt(1);
		int n=s.length();
		if(a!='j' && b!='b') {
			sb.append(s.substring(2));}
		else if(a=='j' && b!='b') 
		{
			sb.append('j').append(s.substring(2));
			}
		else if(a!='j' && b=='b')
			sb.append(s.substring(1));
		else
			sb.append(s.substring(0));
		return sb.toString();
	}
}
