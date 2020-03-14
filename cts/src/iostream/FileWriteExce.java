package iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriteExce {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try (InputStreamReader cin=new InputStreamReader(System.in))
				{
				FileOutputStream out=new FileOutputStream("D://fileresult.txt");
				System.out.println("Enter characters, q to quit");
				char c;
				do {
					c=(char)cin.read();
					out.write(c);
				}while(c!='q');
				}
	}

}
