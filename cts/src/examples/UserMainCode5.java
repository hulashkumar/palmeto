package examples;

public class UserMainCode5 {
	public static int common(int a[],int b[]) {
		int x=a.length,y=b.length,sum=0;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) { 
				if(a[i]==b[j]) {
					sum=sum+a[i];
				}
			}
	}
	return sum;
	}
}
