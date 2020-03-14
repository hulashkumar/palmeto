package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadEmployee {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		double Total=0.0;
		FileInputStream fis=new FileInputStream("d://emp.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream in=new DataInputStream(bis); 
		try {
			while(true) {
				int eno=in.readInt();
				String ename=in.readUTF();
				double sal=in.readDouble();
				Total=Total+sal;
				System.out.println(eno);
				System.out.println(ename);
				System.out.println(sal);
			}
		}
		catch(EOFException e) {
			System.out.println(Total);
		}
	}

}
