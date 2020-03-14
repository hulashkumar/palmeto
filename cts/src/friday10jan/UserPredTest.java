package friday10jan;
import java.util.function.Predicate;
class User{
	String uid,pwd;
	public User(String uid,String pwd) {
		this.uid=uid;
		this.pwd=pwd;
	}
}
public class UserPredTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User("admin","1234");
		User user2=new User("Praveen","kumar");
		Predicate<User> tuser=u->u.uid.equals("Praveen") && u.pwd.equals("1234");
		if(tuser.test(user2))
			System.out.println("valid");
		else
			System.out.println("Not valid");
	}

}
