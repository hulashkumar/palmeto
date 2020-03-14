/*class MyThread implements Runnable{
	public void run() {
		System.out.println("Inside the tread");
	}
}*/
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MyThread m1=new MyThread();
		Thread t=new Thread(m1);
		t.start();*/
		Runnable runnable=() ->System.out.println("Runnable Thread");
		Thread t=new Thread(runnable);
		t.start();
	}

}
