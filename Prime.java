import java.util.*;

class Prime{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        // int[] n=new int[t];
        // for(int i=0;i<t;i++){
        //     n[i]=sc.nextInt();
        // }
        for(int i=2;i<=t;i++){
            boolean flag=false;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(i+" ");
            }
            // else{
            //     System.out.println("prime");
            // }
        }
    }
}