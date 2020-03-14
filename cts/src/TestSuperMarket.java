
abstract class BigBazar{
	public void goods() {
		System.out.println("select your goods");
	}
	abstract public void payment();
	public void transport() {
		System.out.println("items will be delivered by only bicycle");
	}
	
}
class spencer extends BigBazar{
	@Override
	public void payment() {
		System.out.println("payments is only accepted by cash");
	}
}
public class TestSuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spencer s1=new spencer();
		s1.goods();
		s1.payment();
		s1.transport();
		
		BigBazar b1=new BigBazar();
		b1.goods();
		b1.payment();
		b1.transport();
	}

}
