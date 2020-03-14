import java.util.*;
public class Main4{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String []a=new String[n];
     for(int i=0;i<n;i++) {
    	 a[i]=sc.next();
     }
     HashMap<String,Integer> h=new HashMap<String,Integer>();
     ArrayList a1=new ArrayList();
     int discount=0;
     String s1="",s2="",s3="";
		for(int i=0;i<n;i++) {
			String s=a[i];
			StringTokenizer stk=new StringTokenizer(s,",");
			Set<Integer> b=new HashSet<Integer>();
			while(stk.hasMoreElements()) {
				 s1=stk.nextToken();
				 s2=stk.nextToken();
				 int x=Integer.parseInt(s2);
				 s3=stk.nextToken();
				 int y=Integer.parseInt(s3);
				 discount=(x*y)/100;
				 h.put(s1,discount);
			}
		}
		//System.out.println(h);
		String nn=null;
		int min=0;
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext())
		{
		String key=it.next();
		int n1=h.get(key);
		min=n1;
		if(n1<=min) {
			min=n1;
			nn=key;
			}
		}
		System.out.println(nn);
    }
}