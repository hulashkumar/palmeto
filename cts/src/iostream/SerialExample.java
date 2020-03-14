package iostream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialExample {

	public static void main(String[] args) throws  FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		String datafile="d://employeedata";
		ObjectOutputStream out=null;
		try
		{
			Employee empobj1=new Employee(1,"raj",2000.0);
			Employee empobj2=new Employee(2,"Reddy",4000.0);
			out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(datafile)));
			out.writeObject(empobj1);
			out.writeObject(empobj2);
		}
		finally {
			if(out !=null)
			{
				out.close();
			}
		}
		System.out.println("Object state is saved");
	}

}
