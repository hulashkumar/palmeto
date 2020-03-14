package examples;

public class UserMainCode {
	public static String findNature(int a,int b,int c) {
		int d;
		d=(b*b)-(4*a*c);
		if(d>0) 
			return"roots are real and unequal";
		else if(d==0)
		return"roots are real and equal";
		else
			return "roots are imaginary";
	}
}
