package examples;
import java.util.Scanner;
public class Main4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter number");
		int x=scanner.nextInt();
		int[] arr=new int[x];
		for(int i=0;i<x;i++)
			arr[i]=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.println(UserMainCode4.findElement(arr,y));
	}

}
