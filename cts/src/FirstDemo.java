
public class FirstDemo extends FirstInter.one implements InnerDemo.One{

	public void greater(int e,int f) {
		int h;
		h=(e>f)?e:f;
		System.out.println("the greater number"+h);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
FirstDemo obj=new FirstDemo();
obj.display();
obj.greater(30, 50);
	}

}
