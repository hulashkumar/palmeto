import java.util.Scanner;
public class TestOddEven {

	public TestOddEven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int number=obj.nextInt();
		CheckOddNumber obj1=new CheckOddNumber();
		try {
			obj1.oddeven(number);
		}
		catch(EvenNumberException e){
			System.out.println(e);
		}
		catch(OddNumberException e) {
			System.out.println(e);
		}
	}

}
