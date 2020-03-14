package friday10jan;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread Excution begins ");
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("end of thread excution");
	}
	
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread t=new MyThread();
System.out.println("main method started excution");
t.start();
for(int j=1;j<=100;j++)
	System.out.println(j);
System.out.println("Main method completed excution");
System.out.println("Thread Priority  "+t.getPriority());
	}

}
