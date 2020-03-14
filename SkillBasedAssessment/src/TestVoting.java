import java.util.Scanner;
public class TestVoting {

	public TestVoting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter your Age");
		age=sb.nextInt();
		Voting vote=new Voting();
		try {
			vote.testAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		catch(InsuffientAgeException e) {
			System.out.println(e);
		}
	}

}
