import java.util.Scanner;
public class Authority{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String s1=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String s2=sc.nextLine();
        int i,n=0,cnt=0,cnt1=0;
        for(i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
              
                break;
            }
            else {
                cnt++;
            }
        }
        for(i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
              
                break;
            }
            else {
                cnt1++;
            }
        }
       if(cnt==s1.length() && cnt1==s2.length()) {
    	   String s3=s1.trim();
    	   String s4=s1.trim();
        System.out.println(s3.concat(" ").concat(s4).toUpperCase());
       }
       else {
    	   System.out.println("Invalid name");
       }
    }
}