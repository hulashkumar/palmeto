import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
public class UniqueChar{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] chars = str.split("");
        Set<String> uniqueChars = new LinkedHashSet<>();
        for (String s : chars) {
        	uniqueChars.add(s);
        }
        
        String []a=(String[]) uniqueChars.toArray();
      for(int i=0;i<a.length;i++) {
    	  System.out.println(a[i]);
      }
    }
}