package examples;

class A {
	int z;
	A(int x){
		System.out.println(x);
	}
}
class B extends A{
	B(int y){
		super(10);
	System.out.println(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(8);
		
	}

}
