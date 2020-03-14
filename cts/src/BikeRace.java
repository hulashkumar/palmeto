import java.util.Scanner;
public class BikeRace{
	public static int countDigits(int dist) {
        int c=0;
        while (dist>0) {
            dist /= 10;
            c++;
        }
        return c;}
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int dist=sc.nextInt();
        int l=countDigits(dist);
        int p1=1,p2=1;
        for(int j=0;j<n.length();j++){
        	int i=j+1;
        	if(i%2==0) {
        		int x=n.charAt(i);
        		p1=p1*x;
        	}else {
        		int y=n.charAt(i);
        		p2=p2*y;
        	}
        }
        int b;
        if(p1>p2) {
        	b=p1;
        }else {
        	b=p2;
        }
          System.out.println(b);  
        
    }
}