package iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		// TODO Auto-generated method stub
		char ch;
		int x;
		try{FileReader fin=new FileReader("d://fileresult.txt");
				FileWriter fout=new FileWriter("d://file.txt");
		
			x=fin.read();
			while(x!=-1) {
				ch=(char)x;
				fout.write(ch);
				System.out.print(ch);
				x=fin.read();
			}
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
