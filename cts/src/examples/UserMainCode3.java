package examples;

public class UserMainCode3 {
	public static int findElement( int a[],int x) {
		int b=a.length;
		boolean temp=false;
		for(int i=1;i<b;i++) {
				if (a[i]==x) {
					temp=true;
				break;}
		}
		if(temp==true)
			return 1;
		else
			return 0;
	}
	}
