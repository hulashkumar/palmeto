package iostream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderMarks {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			try(InputStreamReader ipr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ipr)){ 
			System.out.println("Enter the first marks");
			int x=Integer.parseInt(br.readLine());
			System.out.println("Enter the second marks");
			int y=Integer.parseInt(br.readLine());
			System.out.println("Enter the third marks");
			int z=Integer.parseInt(br.readLine());
			double avg=(x+y+z)/3;
			System.out.println("The name is:"+avg);
	}
		}
}