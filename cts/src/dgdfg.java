import java.util.Scanner;
class HighestMarkPerSem1{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n =new int[10];
        int[][] m =new int[10][10];
        int i,j;
        System.out.println("Enter no of semester:");
        int sem = sc.nextInt();
        for(i=0;i<sem;i++){
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            n[i] = sc.nextInt();
        }
       
        int c = 0;
        for(j=0;j<sem;j++){
           
            System.out.println("Marks obtained in semester "+(j+1)+":");
            for(int k=0;k<n[j];k++){
               
               
                m[j][k]=sc.nextInt();
                if(m[j][k]<0 || m[j][k]>100){
                    c=1;
                    break;
                }
            }
           
            if(c==1){
                System.out.println("You have entered invalid mark.");
                break;
            }
        }
       
        if(c!=1){
        for(j=0;j<sem;j++){
            int max=0;
            for(int l=0;l<n[j];l++){
                if(max<=m[j][l]){
                    max=m[j][l];
                }
               
            }
            System.out.println("Maximum mark in "+(j+1)+" semester:"+max);
        }}
    }
}
