import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserMainCode
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter no. of element");
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> x = new ArrayList<Integer>();
	    ArrayList<Integer> y = new ArrayList<Integer>();
	    System.out.println("Enter elements of first set");
	    for (int i = 0; i < n; i++)
	      x.add(Integer.parseInt(sc.nextLine()));
	    System.out.println("Enter elements of second set");
	    for (int i = 0; i < n; i++)
	      y.add(Integer.parseInt(sc.nextLine()));
	    System.out.println("Enter your choice to perform");
	    char c = sc.nextLine().charAt(0);
	    System.out.println(UserMainCode1.performSetOperations(x,y,c));
	}
}