package friday10jan;

public class SleepThread extends Thread {

	public void run() {
		try {System.out.println(this.getState());
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
		sleep(1000);
		}}
	catch(InterruptedException e) {
		System.out.println(e);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SleepThread t1=new SleepThread();
t1.start();
System.out.println(t1.getState());
for(int i=1;i<=100;i++)
	System.out.println(i);
System.out.println(t1.getState());
System.out.println(t1.getPriority());
System.out.println(t1.getName());
System.out.println(t1.getId());
	}

}
