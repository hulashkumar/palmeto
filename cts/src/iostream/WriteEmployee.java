package iostream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEmployee {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("d://emp.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream out=new DataOutputStream(bos); 
		out.write(1);
		out.writeUTF("venky");
		out.writeDouble(5000.0);
		
		out.write(2);
		out.writeUTF("hulash");
		out.writeDouble(2000.0);
		
		out.write(1);
		out.writeUTF("Reddy");
		out.writeDouble(7000.0);
		System.out.println("Objetcs written to file");
	}

}
