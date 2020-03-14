package examples;

public class UserMainCode2 {
	public static boolean isPrime(int number) {
		for(int x=2;x<=number/2; x++)	
		if(number%x==0)
			return false;
		return true;	
	}
}
