import java.util.*;
class MaxTillI{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        b[0]=a[0];
        int max=a[0];
        for(int i=1;i<10;i++){
            if(a[i]>max){
                b[i]=a[i];
                max=a[i];
            }
            else{
                b[i]=max;
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(b[i]+" ");
        }
    }
}