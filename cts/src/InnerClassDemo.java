
public class InnerClassDemo {
	class Two{
		public int fact(int n) {
			int f;
			if((n==0) || (n==1))
				return (1);
			else
				f=n*fact(n-1);
				return f;
		}
	}
	public void display() {
		Two obj=new Two();
		System.out.println(obj.fact(5));
	}
}
