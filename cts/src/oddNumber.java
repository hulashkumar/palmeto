import java.util.Scanner;
public class oddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=obj.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
				sum+=i;
		}
		System.out.println(sum);
	}

}
