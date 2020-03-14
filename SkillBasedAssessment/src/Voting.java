
public class Voting {

	public Voting() {
		// TODO Auto-generated constructor stub
	}
	public void testAge(int age) throws InvalidAgeException,InsuffientAgeException{
		if(age>=0 && age<=18) {
			throw new InsuffientAgeException();}
			else if(age<=0 || age>=100) {
				throw new InvalidAgeException();
			}
			else
				System.out.println("Congratulations,you are eligible for voting");
		}
	}


