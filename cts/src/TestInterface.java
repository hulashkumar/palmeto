
interface Drawing{
	public float add(float a,float b);
}
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing Maths=(a,b)->a+b;
		System.out.println("the addition is:"+Maths.add(30,20));
	}

}