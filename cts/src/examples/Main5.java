package examples;
import java.util.Scanner;
public class Main5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter number");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int[] arr=new int[x];
		int[] arr1=new int[y];
		for(int i=0;i<x;i++)
			arr[i]=scanner.nextInt();
		for(int i=0;i<y;i++)
			arr1[i]=scanner.nextInt();
		System.out.println(UserMainCode5.common(arr,arr1));
	}

}
