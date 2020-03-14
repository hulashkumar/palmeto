package iostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try(InputStreamReader ipr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ipr)){ 
		System.out.println("Enter the name");
		String name=br.readLine();
		System.out.println("Enter city name");
		String city=br.readLine();
		System.out.println("The name is:"+name);
		System.out.println("The name is:"+city);
		}
	}

}
