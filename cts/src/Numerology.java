import java.util.Scanner;
public class Numerology{
    public static void main(){
        char[][]a={{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
        {'1','2','3','4','5','8','3','5','1','1','2','3','4','5','7','8','1','2','3','4','6','6','6','5','1','7'}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String s=sc.nextLine();
        int count=0,sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }
            else{
                count=0;
            }
        }
        if(count==s.length()){
            for(int i=0;i<s.length();i++){
                 for(int j=0;j<26;j++){
                     if(s.charAt(i)==a[0][j]){
                         int n=a[1][j];
                         sum+=n;
                     }
                    
            }
            }
            
           System.out.println(sum); 
           
        }
        else
        {
        	System.out.println("Invalid name");
        }
        
    }
}