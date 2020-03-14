
public class CheckOddNumber {

	public CheckOddNumber() {
		// TODO Auto-generated constructor stub
	}
	public void oddeven(int n) throws EvenNumberException,OddNumberException{
		if(n%2==0)
			throw new  EvenNumberException();
		else
			throw new OddNumberException();
	} 
}
