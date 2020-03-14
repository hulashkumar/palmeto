public class User{
	public static boolean ValidatePan(String s) {
		int n=s.length();
		boolean flag=false;
		if(n==10) {
			if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			flag=true;}
				else {
					flag=false;
			}
			
		}
		return flag;
	}

}