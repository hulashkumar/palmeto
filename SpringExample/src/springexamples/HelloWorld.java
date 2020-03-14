package springexamples;

public class HelloWorld {
	public  HelloWorld(String s) {
		System.out.println("I am String Constructor"+s);
	}
	public  HelloWorld(int n) {
		System.out.println("I am Int Constructor"+n);
	}
	public  HelloWorld(int n,String s) {
		System.out.println("I am Int and String Both Constructor  "+n+" "+s);
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void Init() {
		System.out.println("Initilation of HelloWorld");
	}
	public void displays() {
		System.out.println("message is  "+message);
	}

	String message;
}
