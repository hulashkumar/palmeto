
interface Car{
	void acceleration();
	void engine();
	void seatcapacity();
}
class nanoCar implements Car{
	public void acceleration() {
		System.out.println("acceleration should be maximum than normal car");
	}
	public void engine() {
		System.out.println("Engine should be in new technology");
	}
	public void seatcapacity() {
		System.out.println("minimum seat capacity should be 10");
	}
} 
public class carFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nanoCar c1=new nanoCar();
		c1.acceleration();
		c1.engine();
		c1.seatcapacity();
	}

}